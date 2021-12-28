package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class productPage {
	WebDriver driver;
	
	public  productPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	By size = By.xpath("//*[@id=\"a-autoid-12-announce\"]");
	By Buy = By.xpath("//*[@id=\"buy-now-button\"]");
    
	public WebElement size()
     {
    	 return driver.findElement(size);
    	
    }
	public WebElement Buy()
    {
   	 return driver.findElement(Buy);
   	
   }
}
