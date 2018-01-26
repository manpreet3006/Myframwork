package Webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverMethods {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com");
		System.out.println("current url"+d.getCurrentUrl());
		System.out.println("Title"+d.getTitle());
		WebElement id=d.findElement(By.xpath("//input[@id='email']"));
		id.sendKeys("manny3006@gmail.com");
		WebElement pass=d.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("manny8055");
		WebElement login= d.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
		d.findElement(By.xpath("//div[@id='logoutMenu']")).click();
        WebElement logout= d.findElement(By.xpath("//span[@class='_54nh']/following::li[.='Log out']"));
        logout.click();
		System.out.println("page soure"+d.getPageSource());
	//List<WebElement> gender=d.findElements(By.xpath("//input[@name='sex']/following-sibling::label"));
//for(WebElement WebElement:gender){
	//System.out.println(WebElement.getText());}
			d.close();
			d.quit();
		
	}

}
