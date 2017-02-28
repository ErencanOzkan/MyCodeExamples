package com.code.examples.concurrent.java7.examples.ch1.ex5;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//Interrupting a thread
public class FileClock implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			System.out.printf("%s\n", new Date());
			try{
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e){
				System.out.printf("The FileClock has been interrupted\n");
			}
		}
	}

	public static class FileMain {

		public static void main(String[] args) {
			FileClock clock = new FileClock();
			Thread thread = new Thread(clock);
			thread.start();
			try{
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e){
				e.printStackTrace();
			} ;
			thread.interrupt();
		}
	}

}
