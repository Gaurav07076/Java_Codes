package com.topics.firstCode.conditions;
import java.util.Scanner;


public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	    int ans=0;
	    while (n > 0) {
	    	int rem = n % 10;
	    	n = n/10;
	    	ans = ans*10+rem ;
	    	
	    	 
	    }
	    System.out.println(ans);

	}

}
