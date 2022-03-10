package com.javaex.problem;

public class StringUtil {
    
    public static String concatString(String[] arr){
    	String result = "";
    	
    	for(int i = 0; i < arr.length; i++) {
    		result += arr[i];
    	}
       
        return result; 
    }

}
