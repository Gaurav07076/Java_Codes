package com.topics.firstCode.functions;
import java.util.Scanner;


public class SumFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = sum(); //name of the function
		System.out.println(ans);
	}
		static int sum() {                     //calling the function 
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter number 1:");
		int num1 = in.nextInt();
		System.out.println("Enter number 2:");
		int num2 = in.nextInt();
		int sum= num1+num2;
		return sum;
		}

	

}
