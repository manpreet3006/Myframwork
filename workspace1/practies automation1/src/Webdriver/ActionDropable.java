package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDropable {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://jqueryui.com/droppable/");
		d.switchTo().frame(d.findElement(By.xpath("//iframe")));
		WebElement drag = d.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = d.findElement(By.xpath("//div[@id='droppable']"));
	    Actions action = new Actions(d);
	    action.clickAndHold(drag).moveToElement(drop).release().build().perform();
	    d.quit();
	}

}
