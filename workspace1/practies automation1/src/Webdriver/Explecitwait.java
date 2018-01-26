package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explecitwait {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing_clock");
		d.switchTo().frame(d.findElement(By.id("iframeResult")));
		WebDriverWait wait = new WebDriverWait(d,120);
		wait.until(ExpectedConditions.textToBePresentInElement(By.id("txt"),"19:11:32"));
	    
		WebElement clock= d.findElement(By.id("txt"));
		System.out.println(clock.getText());
		d.quit();
	}
}