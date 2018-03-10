package hrank.algorithm.implementation;

import java.util.Scanner;

public class DayOfTheProgrammer {

	static String solve(int year){
        // Complete this function
		String retValue= "";
		if(year<=1917){
			if(year%4==0){
				retValue ="12.09."+String.valueOf(year);
			}else if(year%4!=0){
				retValue ="13.09."+String.valueOf(year);
			}
		}
		else if(year>=1918){
//			retValue=  ( (year%4==0) && (year%100==0)) ||(year%400 ==0) ?"13.09."+String.valueOf(year):"12.09."+String.valueOf(year);
			if(year ==1918){
				retValue ="26.09."+String.valueOf(year);
			}
			else if( (year%4==0) && (year%100!=0) ){
				retValue ="12.09."+String.valueOf(year);
			}else if((year%400 ==0)){
				retValue ="12.09."+String.valueOf(year);
			}else{
				retValue ="13.09."+String.valueOf(year);
			}
		}
		
		return retValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
