package hrank.algorithm.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangrams {

	/*
     * Complete the pangrams function below.
     */
    static String pangrams(String s) {
        
    	Set<Character> pang = new HashSet();
    	for(Character ch: s.toCharArray()){
    		if( (ch >='a' && ch<='z') || (ch >='A' && ch <='Z')){
    			if(!Character.isLowerCase(ch)){
    				pang.add(Character.toLowerCase(ch));
    			}else{
    				pang.add(ch);
    			}
    		}
    			
    	}
    	if(pang.size()==26){
    		return "pangram";
    	}else{
    			return "not pangram";
    		}	
    	}
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
