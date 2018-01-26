package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://paytm.com/");
		WebElement number = d.findElement(By.xpath("//input[@type='tel']"));
		number.sendKeys("8109996077");
		WebElement amount = d.findElement(By.xpath("//input[@type='text' and @data-reactid='196']"));
		amount.sendKeys("80");
		WebElement button = d.findElement(By.xpath("//button"));
		button.clear();
		System.out.println("recharge is done ");
	}

}
