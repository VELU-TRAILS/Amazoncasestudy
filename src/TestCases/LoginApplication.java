package TestCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.AmazonHomePage;
import PageObjectModel.AmazonSignupPage;
import PageObjectModel.productPage;

public class LoginApplication {
	
	@Test 
	public void Amazon() throws InterruptedException
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\sundarvelayutham.pl\\Downloads\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486458706470%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6320829607490962654%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040217%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26gclid%3DCj0KCQiAzfuNBhCGARIsAD1nu-_1y-D-V3hHB-jeVKQmbT2nknyIdSvPKI9APsVKZDaV_Qco2-F7WYEaAnKOEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.manage().window().maximize();
          
          AmazonSignupPage Pagelogin = new AmazonSignupPage(driver);
          Pagelogin.Emailid().sendKeys("velugypsit@gmail.com");
          Pagelogin.Proceed().click();
          Pagelogin.Password().sendKeys("Vairavar04!");
          Pagelogin.Signin().click();
          
  		  AmazonHomePage searchbar = new AmazonHomePage(driver);
  		  searchbar.search().sendKeys("Iphone13");
  		  searchbar.navigate().click();
  		  searchbar.choose().click();
  		  
  		 Set<String> windows = driver.getWindowHandles();
	     Iterator <String> Tab = windows.iterator();
	     String parentID = Tab.next();
	     String childID = Tab.next();
	     driver.switchTo().window(childID);
	     //System.out.println(driver.findElement(By.id("productTitle")).getText());
	     
	     Thread.sleep(1000);
	     
	     productPage prod = new productPage(driver);
	     Actions A = new Actions(driver);
	     A.moveToElement(prod.size()).click().build().perform();
	     prod.Buy().click();
	}
	
		
		
		
	

}
