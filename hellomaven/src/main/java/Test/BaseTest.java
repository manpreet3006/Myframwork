package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver d;

	@BeforeSuite
	public void beforeSuite(){

		d = new FirefoxDriver();
		//d.get("http://google.com");
		d.get("https://www.facebook.com");

	}
}
