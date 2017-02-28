package com.code.examples.concurrent.java7.examples.ch1.ex6;

import java.io.File;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//Interrupting a thread
public class DataSourcesLoader implements Runnable {

	@Override
	public void run() {
		System.out.printf("Beginning data sources loading: %s\n", new Date());
		try{
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.printf("Data sources loading has finished:%s\n", new Date());
	}

	public static class Main {

		public static void main(String[] args) {
			DataSourcesLoader dsLoader = new DataSourcesLoader();
			Thread thread1 = new Thread(dsLoader, "DataSourceThread");
			NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
			Thread thread2 = new Thread(ncLoader, "NetworkConnectionLoader");
			thread1.start();
			thread2.start();
			try{
				thread1.join();
				thread2.join();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.printf("Main: Configuration has been loaded:%s\n", new Date());
		}
	}

}
