package com.companyname.test;


import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.companyname.pageobject.BaseTest;
import com.companyname.pageobject.LoginPage;
import com.companyname.utils.PropertyFile;
import com.companyname.utils.ScreenShotUtils;
@Listeners (ScreenShotUtils.class)
public class TestLoginPage extends BaseTest {
	
	@Test
	public void testLogin(){
		
		LoginPage lp = new LoginPage(d);
		lp.login("manny3006", "2568994");
	}

}
