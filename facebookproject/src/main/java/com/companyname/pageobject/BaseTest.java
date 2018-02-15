package com.companyname.pageobject;

import java.io.FileNotFoundException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.companyname.utils.BrowserUtils;
import com.companyname.utils.PropertyFile;

public class BaseTest {
	
	
    static Map<String,String> evnMap;
    static public WebDriver d ;

	
	  @SuppressWarnings("unchecked")
	  @BeforeSuite
	       public void setUp() throws FileNotFoundException{
		    evnMap = PropertyFile.LoadPlaceHolder("Env.config");
		    d=BrowserUtils.invokebrowser (evnMap.get("os"), evnMap.get("browser"));
		    d.get(evnMap.get("url"));
		
	}
 
}
