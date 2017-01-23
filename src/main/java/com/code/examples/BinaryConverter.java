package com.code.examples;


public class BinaryConverter {
	
    public static  StringBuilder calculateBinaryValue(int N)
    {
        StringBuilder binary = new StringBuilder();
        while(N > 1)
        {
            int value = N%2;
            binary.append(value);
            N = N / 2;
        }
        binary.append(N);
         return binary.reverse();
    }

}
