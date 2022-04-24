package com.topics.firstCode.functions;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Two nos");
		int x = in.nextInt();
		int y = in.nextInt();
		int ans = sum(x , y);
		System.out.println(ans);
		

	}
	static int sum(int a, int b ) {
		int add = a+b;
		return add;
		
	}
	

}
