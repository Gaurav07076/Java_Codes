package com.topics.firstCode.conditions;
import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max = a;
		if (b > max) {
			max = b;
			
		}
		if (c>max) {
			max = c;
			
		
		}
		System.out.println("Max= "+max);
       /* Optimize
        * int max = Math.max(c, Math max(a,b));
        */
	}

}
