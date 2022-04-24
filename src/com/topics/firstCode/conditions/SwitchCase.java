 package com.topics.firstCode.conditions;
 import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String fruit=input.next();
		
		switch(fruit) {
		case "Mango":
			System.out.println("King of fruits");
			break;
		case "Apple":
			System.out.println("A sweet red fruit.");
			break;
		case "Orange":
			System.out.println("Round Fruit");
			break;
		case "Grapes":
			System.out.println("Green Fruit");
			break;
			
		default:
 			System.out.println("Please enter a valid fruit");
		
		}
		
		/*
		 * switch (fruit){
		 *   case "Mango" -> System.out.println("King of fruits");
		 *   case "Apple" -> System.out.println("A sweet red fruit");
		 *   case "Orange" -> System.out.println("Round fruit");
		 *   case "Grapes" -> System.out.println("Green fruit");
		 *   default -> System.out.println("Please enter a valid fruit");
		 */
		
		int day = input.nextInt();
		switch (day) {
		case 1 -> System.out.println("MONDAY");
		case 2 -> System.out.println("TUESDAY");
		case 3 -> System.out.println("WEDNWSDAY");
		case 4 -> System.out.println("THRUSDAY");
		case 5 -> System.out.println("FRIDAY");
		case 6 -> System.out.println("SATURDAY");
		case 7 -> System.out.println("SUNDAY");
		   
		
		}
		switch (day) {
		case 1,2,3,4,5 -> System.out.println("Weekday");
		case 6,7-> System.out.println("Weekend");
		}
		
		

	}

}
