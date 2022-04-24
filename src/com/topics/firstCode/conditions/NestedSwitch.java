package com.topics.firstCode.conditions;
import java.util.Scanner;


public class  NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int empID = in.nextInt();
		String department = in.next();
		
		switch (empID) {
		case 1:
			System.out.println("Kunal Kushwaha");
			break;
		case 2:
			System.out.println("Rahul Rana");
			break;
		case 3:
			switch (department) {
			case "IT":
				System.out.println("IT Department");
				break;
			default:
				System.out.println("NO deoartment entered");
			}
		default:
			System.out.println("Enter correct EmpID");
			}

	}

}
