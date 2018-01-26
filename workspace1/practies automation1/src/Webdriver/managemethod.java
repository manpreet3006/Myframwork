package Webdriver;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class managemethod {
    public static void main(String[] args) {
			WebDriver d = new FirefoxDriver();
			d.get("http://google.com");
			Set<Cookie> cookie=d.manage().getCookies();
			for(Cookie c:cookie){
				System.out.println(c.getName()+ " "+c.getValue());
			}
			d.manage().window().maximize();
			d.quit();
	}
}
