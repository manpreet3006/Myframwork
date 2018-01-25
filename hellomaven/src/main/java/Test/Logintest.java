package Test;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Utils.Loadproperties;
import pageobject.Loginpage;

public class Logintest {
	 @Test
	  public  void loginTest() throws IOException{
	     Map<String,String> map=Loadproperties.loadProperties("env.properties");
		WebDriver d=new FirefoxDriver();
		d.get(map.get("url"));
		Loginpage lp = new Loginpage(d);
         lp.login("", "");
		
		//Assert.assertTrue("User is not logged in",hp.aElementOnHpmePage.isDisplayed());
	}

}
