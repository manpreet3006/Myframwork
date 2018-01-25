package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
		public Loginpage(WebDriver d){
			PageFactory.initElements(d,this);
			}
		@FindBy(id="email")
		   public WebElement email;
		@FindBy(id="pass")
	       public WebElement pass;
		@FindBy(id="loginbutton")
		 public WebElement loginbutton;
		
		public void login(String user , String password){
			this.email.sendKeys("manny3006@gmail.com");
			this.pass.sendKeys("manny8055");
			this.loginbutton.click();
		}

	}
