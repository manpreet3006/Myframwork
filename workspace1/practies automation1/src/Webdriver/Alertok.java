package Webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertok {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@id='iframeResult']")));
	    WebElement button= d.findElement(By.xpath("//button[.='Try it']"));
	    button.click();
	    Alert alert = d.switchTo().alert();
	    Thread.sleep(5000);
	    alert.accept();
	    System.out.println("this is accpected ");
	}

}
