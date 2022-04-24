package com.topics.firstCode.functions;
import java.util.Scanner;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter No to check prime");
		int n=in.nextInt();
		boolean ans= isPrime(n);
		System.out.println(ans);
		System.out.println("enter no. to check Armstrong");
		int j=in.nextInt();
		System.out.println(isArmstrong(j));
		
		//All 3 digit armsrtong
		for (int i=100;i<1000;i++) {
			if(isArmstrong(i)) {
		System.out.print
		(i + " ");
			}
		}
			
   
	} //Prime or not
	static boolean isPrime(int n) {
		if (n<=1){
			return false;
		}
		int c = 2;
	    while(c*c <=n) {
	    	if (n%c == 0) {
	    		return false;
	    	}
	    	c++;
	    }
	    if (c*c>n) {
	    	return true;
	    }
	    return false;
	}// 3 digit armstrong numbers
	static boolean isArmstrong(int j) {
		int sum=0;
		int original = j;
		while (j>0) {
			int rem = j % 10;
			sum += Math.pow(rem, 3) ;
		    j = j/10;
		}
			if (sum == original) {
				return true;
			
		}
			else return false;
	}
	
	
	

}
