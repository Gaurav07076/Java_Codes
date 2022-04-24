package com.topics.firstCode.conditions;
import java.util.Scanner;


public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int num=1; num<= n; num++) {
			System.out.println(num+ " ");
		}
		
		//while loop
		int num =1;
		while (num <= 5) {
			System.out.println(num);
			num +=1;
		}
		
		int z=1;
		do {
			System.out.println(z);
			n++;
			
		}while(n <=5);
		
		

	}

}
