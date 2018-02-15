package com.companyname.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {

	static String driverDirPath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\companyname\\Resources\\Driver\\";
	
	
	  public static WebDriver invokebrowser(String os, String browser){
		  
		  WebDriver d= null;
		  
		  switch(os){
		    case "win":
			  switch (browser){
			    case "ch":
				  System.setProperty("webdriver.chrome.driver",driverDirPath+"Window\\chromedriver.exe");
				  d= new ChromeDriver();
				  break ;
			    case "ff"	:
				 d= new FirefoxDriver(); 
		  		 break ;
			   }
		    case "mac":
			  switch (browser){
			  case "ch":
				  
				  d= new ChromeDriver();
				  break;
				  
			  case "ff":
				
				d= new FirefoxDriver();  
			     break ;  
			   }
		   //  default :
		    //	 d= new FirefoxDriver();
		   // 	 break;
		  }
		  
		return d ;
		  
	  }
}
