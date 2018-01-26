package Webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSelectable {
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://jqueryui.com/selectable/");
		d.switchTo().frame(d.findElement(By.xpath("//iframe")));
		List<WebElement> list =d.findElements(By.xpath("//ol[@id='selectable']/li"));
		Actions action = new Actions(d);
		action.keyDown(Keys.CONTROL).click(list.get(0)).click(list.get(2)).click(list.get(4)).keyUp(Keys.CONTROL).build().perform();
	}

}
