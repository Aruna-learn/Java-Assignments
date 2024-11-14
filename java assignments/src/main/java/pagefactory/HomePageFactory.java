 package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	@FindBy(xpath="//*[@id=\"header_container\"]/div[1]/div")
	WebElement logo;
	WebDriver driver;


	public HomePageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	} 

	public void applogodisplayed() {
		logo.isDisplayed();
	}


	








}
