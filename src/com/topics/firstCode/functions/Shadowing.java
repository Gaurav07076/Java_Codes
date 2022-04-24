package com.topics.firstCode.functions;

public class Shadowing {
	static int x =90;//it will be available to everyone in shadowing class
                      // this will be shadowed at line 8
	public static void main(String[] args) {
		System.out.println(x);
		int x = 40;
		System.out.println(x)	;
		fun();

	}
	static void fun() {
		System.out.println(x);  // this will give 90 because x= 40 is in another block and works in that block only
	}

}
