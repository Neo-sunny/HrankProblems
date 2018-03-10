package hrank.algorithm.strings;

import java.util.Scanner;

public class StrongPassword {
	static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
		int upcase=0;
		int lcase=0;
		int digit=0;
		int special_char=0;
		final String SPECIAL_CHARACTERS =".*[!@#$%^&*()-+].*"; 
		int retValue=0;
		if(n<6){
			retValue=6-n;
		}else if(n>=6){
			
			if(password.matches(".+[A-Z].+")){
				if(upcase==0) upcase++;
			} if(password.matches(".+[a-z].+")){
				if(lcase==0) lcase++;
			} if(password.matches(".+[0-9].+")){
				if(digit==0) digit++;
			} if(password.matches(SPECIAL_CHARACTERS)){
				if(special_char==0) special_char++;
			}
			
			retValue = 4-(upcase+lcase+digit+special_char);
		}
		
		
		return retValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(n, password);
        System.out.println(answer);
        in.close();
    }
}
