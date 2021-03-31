








package com.crm.bizdom.genericrepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Fileutility {

	
		
	//This method will return property value by passing key as an argument
		//@param key
		//@return value
		//@throws Throwable
		
		public String getPropertykeyValue(String key) throws Throwable {	
		FileInputStream fis= new FileInputStream(".\\testdata\\sallu.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		}
		
		public static void main(String[] args) throws Throwable {
			System.out.println(new Fileutility().getPropertykeyValue("browser"));
			System.out.println(new Fileutility().getPropertykeyValue("url"));
			System.out.println(new Fileutility().getPropertykeyValue("username"));
			
		

	}

}
