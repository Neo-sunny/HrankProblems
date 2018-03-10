package com.rank.probs;

import java.util.Scanner;

public class EndOfFile {
	static int B;
	static int H;
	static boolean flag;
	static{
	    Scanner scan = new Scanner(System.in);
	 B=scan.nextInt();
	 H=scan.nextInt();
	 flag= false;
	if(B>0 && H>0){
	    flag=true;
	}else{
	    System.out.print("java.lang.Exception: Breadth and height must be positive");
	}
	}

	    public static void main(String[] args) {
//	        Scanner scan = new Scanner(System.in);
//	     int    index=1;
//	        while(scan.hasNext()){
//	            String s=scan.nextLine();
//	            System.out.println(index+" "+s);
//	            index++;
//	        }
	        if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
	    }
	}
