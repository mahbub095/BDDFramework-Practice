package step_def;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_Login_Page(){
	 
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			driver.get("https://freecrm.com/index.html");
		 

	 }
	 
	 @When("^title of login page is Free CRM$")
	 public void title_of_login_page_is_Free_CRM(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	 }
	 
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	// @Then("^user enters username and password$")
	  
	 public void user_enters_username_and_password(String username, String password){
	 driver.findElement(By.name("email")).sendKeys(username);
	 driver.findElement(By.name("password")).sendKeys(password);
	 }
	 
	 @Then("^user clicks on login button$")
	 public void user_clicks_on_login_button() {
	 WebElement loginBtn =
	 driver.findElement(By.xpath("//input[@type='submit']"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", loginBtn);
	 }
	 
	 @Then("^user is on home page$")
	 public void user_is_on_hopme_page(){
	 String title = driver.getTitle();
	 System.out.println("Home Page title ::"+ title);
	 Assert.assertEquals("CRMPRO", title);
	 }
	 
	 @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	 public void user_enters_contacts_details(String firstname, String lastname, String position){
		 driver.findElement(By.id("first_name")).sendKeys(firstname);
		 driver.findElement(By.id("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position);
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	 }
	 

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
	 
}
