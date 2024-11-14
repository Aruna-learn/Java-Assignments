package bddcucumberframework;



import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pageobjects.Login;

public class LoginSteps {
//	WebDriver driver;
//	Login lg;
//
//	@Given("I am on the Sauce Demo login page")
//	public void i_am_on_the_Sauce_Demo_login_page() {
//
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//
//	}
//
//	@When("I enter username {string} and password {string}")
//	public void i_enter_username_and_password(String username, String password) {
//		lg = new Login(driver);
//		lg.enterUsername(username);
//		lg.enterPassword(password);
//	}
//
//	@When("I click the login button")
//	public void i_click_the_login_button() {
//		lg.clickLogin();
//	}
//
//	@Then("I should see {string}")
//	public void i_should_see(String result) {
//		if (result.equals("the products page")) {
//			String currentUrl = driver.getCurrentUrl();
//			assertEquals("https://www.saucedemo.com/v1/inventory.html", currentUrl);
//		} else if (result.equals("an error message")) {
//			String errorMessage = lg.getErrorMessage();
//			assertNotNull(errorMessage);
//			assertTrue(errorMessage.contains("Epic sadface: Username and password do not match any user in this service") ||
//					errorMessage.contains("Epic sadface: Sorry, this user has been locked out."));
//		}
//		driver.quit();
//	}

}
