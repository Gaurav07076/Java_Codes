package com.topics.firstCode.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class multidimensonalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		/*
		 * 123
		 * 456
		 * 789
		 */
	//	int[][] arr = new int[3][];
		int[][] arr= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		        };
		
	    int[][]ar= new int[][]{
				{1, 2, 3},  //0th index
				{4, 5},    //1st index
				{6, 7, 8, 9} //2nd index      //Multidimensonal arrays can have variable column size
		};
	    
	    
	    //input of a multidimensonal array
	    int[][] vr = new int[3][3];
	    for(int row =0 ; row <  vr.length; row++ ) {
	    	// for each col in every row
	    	for(int col = 0; col< vr[row].length ; col++) {
				arr[row][col] = in.nextInt();
			}
	    }

		//output
		for(int row = 0 ; row < vr.length; row++){

			for(int col=0;col<vr[row].length;col++){
				System.out.print(arr[row][col]+ " ");
			}
			System.out.println();
		}

		//aliter output
		for(int row = 0 ; row < vr.length; row++){
			System.out.println(Arrays.toString(arr[row]));
		}

		//aliter
		for(int[] a: arr){
			System.out.println(Arrays.toString(a));
		}

	    		
		 
         
  	}
}
