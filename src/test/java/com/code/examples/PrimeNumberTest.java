package com.code.examples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeNumberTest {

	@Test
	public void isPrime_PrimeNumber_True() {
		boolean isPrime = PrimeNumber.isPrime(2);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(2);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(71);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(383);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(409);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(491);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(557);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(691);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(809);
		assertTrue(isPrime);

		isPrime = PrimeNumber.isPrime(883);
		assertTrue(isPrime);
	}

	@Test
	public void isPrime_NotPrimeNumber_False() {
		boolean isPrime = PrimeNumber.isPrime(-1);
		assertFalse(isPrime);

		isPrime = PrimeNumber.isPrime(0);
		assertFalse(isPrime);

		isPrime = PrimeNumber.isPrime(1);
		assertFalse(isPrime);

		isPrime = PrimeNumber.isPrime(18);
		assertFalse(isPrime);

		isPrime = PrimeNumber.isPrime(36);
		assertFalse(isPrime);

		isPrime = PrimeNumber.isPrime(65);
		assertFalse(isPrime);

		isPrime = PrimeNumber.isPrime(88);
		assertFalse(isPrime);

		isPrime = PrimeNumber.isPrime(338);
		assertFalse(isPrime);

		isPrime = PrimeNumber.isPrime(758);
		assertFalse(isPrime);
	}

}
