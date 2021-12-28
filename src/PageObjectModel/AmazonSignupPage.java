package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSignupPage {
	WebDriver driver;
	
	public  AmazonSignupPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	By mailId = By.id("ap_email");
    By proceed = By.id("continue");
    By Password = By.name("password");
    By signin = By.id("signInSubmit");
     public WebElement Emailid()
     {
    	 return driver.findElement(mailId);
    	
    }
     public WebElement Proceed()
     {
    	 return driver.findElement(proceed);
    	
    }
     public WebElement Password()
     {
    	 return driver.findElement(Password);
    	
    }
     public WebElement Signin()
     {
    	 return driver.findElement(signin);
    	
    }

}
