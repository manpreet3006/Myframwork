package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSortable {
	public static void main(String[] args) {
	WebDriver dr = new FirefoxDriver();
	sortable(dr);
	}
	public static void sortable(WebDriver d){
		
			d.get("http://jqueryui.com/sortable/");
			d.switchTo().frame(d.findElement(By.xpath("//iframe")));
			List<WebElement> list =d.findElements(By.xpath("//ul[@id='sortable']/li"));
			Actions action = new Actions(d);
		    action.clickAndHold(list.get(1)).moveToElement(list.get(2)).release().build().perform();
	}
}
