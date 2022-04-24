package com.topics.firstCode.functions;
import java.util.Arrays;
public class VariableLengthArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(2,3,45,554,55);
		 
	}
    static void fun(int ...v) {
    	System.out.println(Arrays.toString(v));
    }
   
}