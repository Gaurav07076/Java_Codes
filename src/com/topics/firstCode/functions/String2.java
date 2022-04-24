package com.topics.firstCode.functions;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name"); 
		String naam = in.next();
		 String personalised = myGreet(naam);
		 System.out.println(personalised);

	}
	static String myGreet(String name) {
		String message = "Hello "+ name;
		return message;
	}

}
