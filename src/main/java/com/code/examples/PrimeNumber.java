package com.code.examples;

public class PrimeNumber {

	public static boolean isPrime(int number) {
		boolean isPrime = true;
		if(number <= 1){
			return false;
		}
		int checkUntil = number / 2;
		for(int i = 2; i < checkUntil; i++){
			if(number % i == 0){
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

}
