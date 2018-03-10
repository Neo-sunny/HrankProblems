package com.rank.probs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	public static void main(String[] args) {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMddHHmmssSSS");//dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    System.out.println(strDate);
	}
	 
}
