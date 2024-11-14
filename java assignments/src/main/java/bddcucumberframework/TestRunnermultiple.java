package bddcucumberframework;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"C:\\Software\\Aruna_JAVA\\java assignments\\Feature\\Multiple.feature"},
glue={"bddcucumberframework"},
plugin={"pretty", "html:target/report.html"})  
 
	
 
public class TestRunnermultiple extends AbstractTestNGCucumberTests{

}
