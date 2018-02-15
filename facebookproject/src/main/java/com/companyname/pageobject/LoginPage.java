package com.companyname.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver d;
	
	public LoginPage(WebDriver d){
	    this.d=d;
	    PageFactory.initElements(d, this);
		
	}
	@FindBy(id="email")
	 	WebElement emailfield;
	 
	 	@FindBy(id="pass")
	 	WebElement passwordField;
	 	
	 	@FindBy(id="u_0_2")
	 	WebElement loginButton;
	 	
	 	public void login(String uid,String pass){
	 		emailfield.sendKeys(uid);
	 		this.passwordField.clear();
	    	this.passwordField.sendKeys(pass);
	 		this.loginButton.click();
	 	}

}
