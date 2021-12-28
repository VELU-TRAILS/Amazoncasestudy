package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage {
WebDriver driver;
	
	public  AmazonHomePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	 By search = By.id("twotabsearchtextbox");
     By navigate = By.id("nav-search-submit-button");	
     By option = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");

     public WebElement search()
     {
    	 return driver.findElement(search);
    	
    }
     public WebElement navigate()
     {
    	 return driver.findElement(navigate);
    	
    }
     public WebElement choose()
     {
    	 return driver.findElement(option);
    	
    }
}
