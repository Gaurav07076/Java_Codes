package com.topics.firstCode.functions;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(67);  // which one to call is decided during compile time 

	}
	static void fun(int a) {
		System.out.println(a);
	}
	static void fun(String a) {
		System.out.println(a);
	}

}
