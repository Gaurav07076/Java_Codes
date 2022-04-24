package com.topics.firstCode.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array of primitives
		int[] arr= new int[5];
		arr[0] =  23;
		arr[1] =  45;
		arr[2] =  20;
		arr[3] =  56;
		arr[4] =  48;
		// [23,45,20,56,48}
		System.out.println(arr[3]);
		Scanner in= new Scanner(System.in);
		
		//input using  foor loops
		for (int i=0; i< arr.length; i++) {
			arr[i]=in.nextInt();
			System.out.print(arr[i]+ " ");
		}
		System.out.println(Arrays.toString(arr));
		 
//	for(int num : arr) {             //for every element in array, print the element
//		System.out.println(num + " ");     //here num represents elements of the array
		
		//array of objects
		String[] str = new String[4];
		for (int i = 0; i<str.length; i++) {
			str[i]= in.next();
			}
		System.out.println(Arrays.toString(str));
	}

	

}
