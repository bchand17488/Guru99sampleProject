package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementLocators {

	public WebDriver driver;
	
	
	@FindBy(name="uid")
	WebElement username; 
	
	@FindBy(name="password")
	WebElement password; 
	
	@FindBy(name="btnLogin")
	WebElement register;
	
	
	
	
	public ElementLocators(WebDriver driver)
	{

		this.driver=driver;
		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
	    PageFactory.initElements(driver, this);
	}
	
	
	public void provideLoginInfo(String name, String pass)
	{ 
		username.sendKeys(name);
		password.sendKeys(pass);
	}
	
	



   public void clickLoginButton()
   { 
	   register.click();
   }

   public void getTitlte() {
	 driver.getTitle();
   }


}
