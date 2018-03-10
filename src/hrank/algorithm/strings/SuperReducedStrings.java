package hrank.algorithm.strings;

import java.util.Scanner;

public class SuperReducedStrings {

	static String super_reduced_string(String s){
		
		StringBuffer reducedString = new StringBuffer(s);
		for(int i=1; i<reducedString.length(); i++){
			
			if(reducedString.charAt(i-1)==reducedString.charAt(i)){
				reducedString.delete(i-1, i+1);
				i=0;
			}
		}
		String superReduced =reducedString.toString().trim();
		if(!superReduced.equals("")){
			return superReduced;
		}else{
			return "Empty String";
		}
		
	}
/*	
	static String super_reduced_string(String s){
		
        int[] charsCount= new int[26];
        
        for(char c:s.toCharArray()){
        	charsCount[c-'a']++;
        }
        int index=0,j=0;
        char[] result = new char[s.length()];
		for(int i:charsCount){
			if(i%2!=0){
				result[j++]=(char)(index+97);
				
			}
			index++;
		}
		String retval=String.copyValueOf(result).trim();
		if(!retval.equals("")){
			return retval;
		}else{
			return  "Empty String";
		}
    }
*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
