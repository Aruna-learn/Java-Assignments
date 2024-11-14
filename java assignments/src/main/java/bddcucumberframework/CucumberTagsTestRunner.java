package bddcucumberframework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke and not @pref",features= {"C:\\Software\\Aruna_JAVA\\java assignments\\cucumbertags"},glue= {"bddcucumberframework"},plugin= {"pretty","html:target/reddy.html"})



public class CucumberTagsTestRunner extends AbstractTestNGCucumberTests {

}
