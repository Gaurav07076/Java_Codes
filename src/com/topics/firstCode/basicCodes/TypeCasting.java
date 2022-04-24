package com.topics.firstCode.basicCodes;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float num = input.nextInt();
		System.out.println(num); 
		 
		int castno= (int)67.56f;
		System.out.println(castno);
		
		//automatic type promotion in expressions
		int a = 257;
		byte b = (byte)(a); // 257 % 256 = 1
		
		System.out.println(b);
		
	    byte c = 40;
	    byte d = 50;
	    byte e = 100;
	    int f = c * d/ e;
	    System.out.println(f);
	    
	    int number = 'A';
	    System.out.println();
	    
	    byte g = 42;
	    char h = 'a';
	    short s =1024;
	    int i = 50000;
	    float j = 52.45f;
	    double k = 0.1234;
	    double result =(j+g)+(i+h)-(k-s);
	    System.out.println((j+g)+" "+(i+h)+" "+(k-s));
	    System.out.println(result);		
		

	}

}
