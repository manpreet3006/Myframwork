package com.manpreetsingh.MyMavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sampleclass {
	
	@Test
	 void m1(){
		WebDriver d =  new FirefoxDriver();
		d.get("http://facebook.com");
	}

}
