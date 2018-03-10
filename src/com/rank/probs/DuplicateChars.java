package com.rank.probs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {

	public static void main(String[] args) {
		duplicates("Javazz");
	}
	static void duplicates(String a) {
        int counter=0;
        // Complete the function by writing your code here.
        int[] letterCount= new int[26];
        for(char c:(a.toLowerCase()).toCharArray()){
        	System.out.print(c-'a'+" ");
        	letterCount[c-'a']++;
        }
        System.out.println(Arrays.toString(letterCount));
        for(int i=0; i<=25; i++){
        	if(letterCount[i]>1){
        		System.out.println((char)(i+'a'));
        	}
        }
        
    }
	
	static void duplicates1(String a) {
		Map<Character, Integer> charmap= new HashMap<>();
		for(Map.Entry<Character, Integer> entry: charmap.entrySet()){
			System.out.println(entry.getValue()+" "+entry.getKey());
		}
	}
}
