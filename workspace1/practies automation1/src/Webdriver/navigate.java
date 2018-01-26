package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigate {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.navigate().to("http://google.com");
		d.navigate().to("http://facebook.com");
		d.navigate().back();
		d.navigate().forward();
		d.navigate().refresh();
	}

}
