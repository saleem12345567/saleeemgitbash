package com.crm.bizdom.genericrepository;

import java.util.Date;
import java.util.Random;

public class Javautility {
	
	public int generateRandomNum(){//This method return random number
		Random r=new Random();
		return r.nextInt(1000);
		
	}
	public String getDateAndTime(){
		Date d=new Date();
		return d.toString().replace(" ", " -");
		
	}
	
	public static void main(String[] args) {
		System.out.println(new Javautility().generateRandomNum());
		System.out.println(new Javautility().getDateAndTime());
		

	}

}
