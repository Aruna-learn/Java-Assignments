package bddcucumberframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePageFactory;
import pagefactory.LoginPageFactory;

public class PageFctoryStepDefinition {
	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory home;

      
   @Given("user is on logn page")
   public void user_is_on_logn_page() {
	 //Intiate web browser instance. 
	   driver = new ChromeDriver();  
      driver.navigate().to("https://www.saucedemo.com/v1/"); 
   }

   
      @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
    	  login =new LoginPageFactory(driver);
          login.enterusername(username);
          login.enterpassword(password);
    }
      
   

   @And("click on Log in Button")
   public void click_on_log_in_button() {
	   login.clcikonlogin();
   }

   @Then("user is navigated to Home page")
   public void user_is_navigated_to_home_page() {
       System.out.println("title is: "+driver.getTitle());
       home=new HomePageFactory(driver);
       home.applogodisplayed();
       
   }
   
   
   @And("close the bowser")
   public void close_the_bowser() {
       driver.quit();
   }

}
