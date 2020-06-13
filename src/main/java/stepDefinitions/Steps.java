package stepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	@Given("^Open the Chorom and start application")
	
	public void open_the_Chorom_and_start_application() throws Throwable
	
	{	try {
		System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
		driver = new ChromeDriver();
		// manage use for browser property
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://testword.test/");
		System.out.println("Open Browser");	
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	@When("^Enter login and order")
	public void enter_login_and_order() throws Throwable {   
		
		try
	{
        System.out.println("Testing Proecedure");
		  driver.findElement(By.linkText("Register or Sign in")).click();
 
		  WebElement email = driver.findElement(By.linkText("Login"));
	        for (int i=0; i<1; i++) {											
	        	email.click(); 
	        	driver.findElement(By.id("username")).sendKeys("admin");
	        	driver.findElement(By.id("password")).sendKeys("admin");
	        	driver.findElement(By.xpath("//button[text()='Login']")).click();
	        	driver.findElement(By.linkText("Home")).click();
	        	driver.findElement(By.linkText("Accessories")).click();
	        	driver.findElement(By.xpath("//h2[contains(text(), 'Amkov CDC3 7inch TFT Screen 18 CMOS')]")).click();
	        	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	        	driver.findElement(By.linkText("View cart")).click();
	        	driver.findElement(By.linkText("Proceed to checkout")).click();
	        	driver.findElement(By.xpath("//*[@id='terms']")).click();
	        	driver.findElement(By.xpath("//*[@id='place_order']")).click();
	      	 
	        }
		}
	        catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	
	@Then("^user should be able to Order successfully")
	public void user_should_be_able_to_order_successfully() throws Throwable
	{
		driver.findElement(By.xpath("//*[@id='place_order']")).click();
		System.out.println("Successfull");
		driver.close();
	}
	
}
