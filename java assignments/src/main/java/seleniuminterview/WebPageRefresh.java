package seleniuminterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class WebPageRefresh {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.netflix.com/in/");

		driver.findElement(By.name("email")).sendKeys("aruna");

		Thread.sleep(3000);
		List<WebElement>	 link=driver.findElements(By.tagName("a"));
		for(WebElement li:link){
			System.out.println(li.getText() + " - " + li.getAttribute("href"));
		}		
		System.out.println(link.size());
		//driver.navigate().refresh();

		//driver.navigate().to(driver.getCurrentUrl());

		//driver.get(driver.getCurrentUrl());
		//		Actions  act=new Actions(driver);
		//		act.sendKeys(Keys.F5);

		//using javascript executor  
		//		JavascriptExecutor exe= (JavascriptExecutor)driver;
		//			exe.executeScript("window.scrollBy(0,500)");
		//window.locate.refresh;

	}

}
