package Webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.Wait;

public class WebDriverMethods1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d = new FirefoxDriver();
		d.get("http://www.amazon.in/s/ref=nb_sb_ss_i_4_3?url=search-alias%3Daps&field-keywords=iphone+7&sprefix=iph%2Caps%2C1260&crid=16AFFPKT2OWAA");
		String parentWindow=d.getWindowHandle();
		System.out.println("Window handle of parent :"+parentWindow);
		Thread.sleep(2000);
		WebElement link = d.findElement(By.xpath("//h2[text()='Apple iPhone 7 Plus (Jet Black, 128GB)']"));
        link.click();
        //to get the window handles
        Set<String> handles= d.getWindowHandles();
        for(String child:handles){
        	if(!parentWindow.equals(child)){
        		d.switchTo().window(child);
        		System.out.println("swithch to "+ child);
        	}
        }
	}

}
