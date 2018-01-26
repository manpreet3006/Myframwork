package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandlening {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		d.switchTo().frame(d.findElement(By.id("iframeResult")));
		d.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		Alert alert= d.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("this is manoreet pc");
		alert.accept();
	}

}
