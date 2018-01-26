package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragable {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://jqueryui.com/draggable/");
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement drag = d.findElement(By.xpath("//div[@id='draggable']"));
		Actions action= new Actions(d);
		action.clickAndHold(drag).moveByOffset(100, 100).release().build().perform();
		d.quit();
	}

}
