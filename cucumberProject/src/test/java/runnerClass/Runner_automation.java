package runnerClass;

import org.Automationproject.Automation_demosite_baseclass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/cucumberProject/Feature/automation.feature",glue = "/cucumberProject/src/test/java/stepdefinition/Stepdef_automation.java",monochrome = true,plugin = {
		"html:Reports/automation_test_report.html"
})
public class Runner_automation extends Automation_demosite_baseclass{
public static WebDriver driver;
	
	@BeforeClass
    public static void set_up() {
	driver=getbrowser("chrome");
	Url("http://automationpractice.com/index.php");
}
	@AfterClass
	public static void Tear_down() {
	close();

	}
}
