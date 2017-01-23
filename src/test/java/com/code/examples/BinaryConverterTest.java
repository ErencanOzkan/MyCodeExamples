package com.code.examples;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.code.examples.BinaryConverter;

public class BinaryConverterTest {
	
	@Test
	public void calculateBinaryValue_DecimalNumber_BinaryRepresentation()
	{
		StringBuilder binaryRepresentaion = BinaryConverter.calculateBinaryValue(9);
		assertTrue("1001".equals(binaryRepresentaion.toString()));
		
		binaryRepresentaion = BinaryConverter.calculateBinaryValue(1);
		assertTrue("1".equals(binaryRepresentaion.toString()));
		
		binaryRepresentaion = BinaryConverter.calculateBinaryValue(0);
		assertTrue("0".equals(binaryRepresentaion.toString()));
		
		binaryRepresentaion = BinaryConverter.calculateBinaryValue(2);
		assertTrue("10".equals(binaryRepresentaion.toString()));
		
		binaryRepresentaion = BinaryConverter.calculateBinaryValue(529);
		assertTrue("1000010001".equals(binaryRepresentaion.toString()));
		
		binaryRepresentaion = BinaryConverter.calculateBinaryValue(20);
		assertTrue("10100".equals(binaryRepresentaion.toString()));
		
		binaryRepresentaion = BinaryConverter.calculateBinaryValue(483647);
		assertTrue("1110110000100111111".equals(binaryRepresentaion.toString()));
		
		binaryRepresentaion = BinaryConverter.calculateBinaryValue(1041);
		assertTrue("10000010001".equals(binaryRepresentaion.toString()));
		
		binaryRepresentaion = BinaryConverter.calculateBinaryValue(15);
		assertTrue("1111".equals(binaryRepresentaion.toString()));
		
	}

}
