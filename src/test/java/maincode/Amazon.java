package maincode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon {
	public static WebDriver w;
	@Given("Open the chrome and url of the application")
	public void open_the_chrome_and_url_of_the_application() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sundarvelayutham.pl\\Downloads\\chromedriver.exe");
		w = new ChromeDriver();
	w.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58355126069%26hvpone%3D%26hvptwo%3D%26hvadid%3D486458706470%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D6320829607490962654%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9040217%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2154373%26gclid%3DCj0KCQiAzfuNBhCGARIsAD1nu-_1y-D-V3hHB-jeVKQmbT2nknyIdSvPKI9APsVKZDaV_Qco2-F7WYEaAnKOEALw_wcB&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	w.manage().window().maximize();
	    System.out.println("opening amazon app");
	}

	@When("enter emailid,password and Click on login button")
	public void enter_emailid_password_and_click_on_login_button() throws InterruptedException {
		w.findElement(By.id("ap_email")).sendKeys("velugypsit@gmail.com");
		w.findElement(By.id("continue")).click();
		w.findElement(By.name("password")).sendKeys("Vairavar04!");
		w.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		System.out.println("entering credential");
	}

	@Then("login success")
	public void login_success() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("login successful");
		
	}

	@Given("Picking the product")
	public void picking_the_product() {
	    System.out.println("search for Iphone");
	}

	@When("select the product with required specification")
	public void select_the_product_with_required_specification() {
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone13");
		w.findElement(By.id("nav-search-submit-button")).click();	
		  System.out.println("selecting the required specification");
	}

	@Then("searchforproduct")
	public void searchforproduct() {
		w.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		System.out.println("product have been searched");
	}

	@Given("Placing order")
	public void placing_order() {
	    System.out.println("choosing Iphone");
	}

	@When("pushing order to card")
	public void pushing_order_to_card() {
		w.findElement(By.xpath("//*[@id=\"a-autoid-12-announce\"]")).click();
		w.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
	    System.out.println("choosing specification");
	   
	}

	@Then("order placed")
	public void order_placed() {
	    System.out.println("order have been placed");
	}
}
