package com.topics.firstCode.conditions;

public class MultipleIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary = 25000;
		if (salary>10000) {
			salary +=2000;
		} else if (salary>20000) {
			salary +=3000;
			
		} else {
			salary +=1000;
			
		}
		System.out.println(salary); 

	}

}
