package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
WebDriver driver;


// Constructor to initialize WebDriver
public Login(WebDriver driver) {
	this.driver = driver;
}
	
	
//By txt_username=By.id("user-name");
//By txt_password=By.id("password");
//By btn_login=By.id("login-button");
//By txt_visible= By.xpath("//div[text()='Products']");
//By app_logo=By.xpath("//div[@class='app_logo']");
//
//
//public void enterusername(String username) {
//	driver.findElement(txt_username).sendKeys(username);
//}
//
//public void enterpassword(String password) {
//	driver.findElement(txt_password).sendKeys(password);
//}
//
//
//public void clicklogin() {
//	driver.findElement(btn_login).click();
//}
//
//public void applogodisplayed() {
//	driver.findElement(app_logo).isDisplayed();
//}
//public void userlogin(String username, String password) {
//	driver.findElement(txt_username).sendKeys(username);
//	driver.findElement(txt_password).sendKeys(password);
//	driver.findElement(btn_login).click();
//}
//


private By usernameField = By.id("user-name");
private By passwordField = By.id("password");
private By loginButton = By.id("login-button");
private By errorMessage = By.cssSelector("h3[data-test='error']");


public void enterUsername(String username) {
    driver.findElement(usernameField).sendKeys(username);
}

public void enterPassword(String password) {
    driver.findElement(passwordField).sendKeys(password);
}

public void clickLogin() {
    driver.findElement(loginButton).click();
}

public String getErrorMessage() {
    return driver.findElement(errorMessage).getText();
}










}
