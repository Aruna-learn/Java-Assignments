//package bddcucumberframework;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class StepDefinition {
//	static WebDriver driver;
//	    
//	
//	      
//	   @Given("user is on logn page")
//	   public void user_is_on_logn_page() {
//		 //Intiate web browser instance. 
//		   driver = new ChromeDriver();  
//	      driver.navigate().to("https://www.saucedemo.com/v1/"); 
//	   }
//
//	   @When("user enters valid username and passsword")
//	   public void user_enters_valid_username_and_passsword() {
//	      driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	      driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	      
//	   }
//
//	   @And("click on Log in Button")
//	   public void click_on_log_in_button() {
//		   driver.findElement(By.id("login-button")).click();
//	   }
//
//	   @Then("user is navigated to Home page")
//	   public void user_is_navigated_to_home_page() {
//	       System.out.println(driver.getTitle());
//	   }
//
//	   
//	   @After
//	   @And("close the bowser")
//	   public void close_the_bowser() {
//	       //driver.close();
//	   }
//
//
//
//	      
//	 
//}
