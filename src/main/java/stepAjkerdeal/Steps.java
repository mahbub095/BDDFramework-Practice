package stepAjkerdeal;

 


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	@Given("^Open the Chorom and start application")
	public void open_the_chorom_and_start_application() throws Throwable
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\c\\chromedriver.exe");
		driver = new ChromeDriver();
		// manage use for browser property
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://twitter.com/login");
		System.out.println("Open Browser");
	}
	
	@When("^Enter the Username and Password")
	public void enter_the_username_and_password() throws Throwable
	{
		driver.findElement(By.xpath("//*[@name='session[username_or_email]']")).sendKeys("abc.comtest");
		driver.findElement(By.xpath("//*[@name='session[password]']")).sendKeys("00000");
		System.out.println("Username and password");
	}
	
	@Then("^user should be able to login successfully")
	public void user_should_be_able_to_login_successfully() throws Throwable
	{
		
		driver.findElement(By.xpath("//*[contains(@class, 'r-vlx1xi')]//span[text()='Log in']")).click();
 
		System.out.println("Credential");
	}
	
}
