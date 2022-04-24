 package com.topics.firstCode.functions;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b= 20;
		{
			//int a = 78; already intialised outside the block in the same and cannot be reintialised again
			a = 100;// reassign the origin ref variable to some other variable
			int c= 99;  // values intialised in this block wiill remain in this block
			
		}
  //   System.out.println(c);  cannot use outside the block 
		
		// scoping in for loop
		for (int i =0; i<4; i++) {
			System.out.println(i);
			int num = 90;
			a = 150;   // a being used again but not reintialised
			 
		}
	}
	static void random(int marks) {
		int num = 67;
		System.out.println(num );
	}
}