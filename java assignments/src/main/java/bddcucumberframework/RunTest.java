package bddcucumberframework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"C:\\Software\\Aruna_JAVA\\java assignments\\Feature\\Login.feature"},
glue={"bddcucumberframework"},
plugin={"pretty", "html:target/htmlreport.html"})  
public class RunTest extends AbstractTestNGCucumberTests { 
	
}  



