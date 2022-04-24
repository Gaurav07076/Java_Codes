package com.topics.firstCode.conditions;
import java.util.Scanner;

public class FibbonaciNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n = in.nextInt();
		int a=0;
		int b=1;
		for(int count=2; count<=n; count++) {
		    int temp=b;
			b= b + a;
			a = temp;
			
			
		}
		System.out.println(b);
		

	}

}
