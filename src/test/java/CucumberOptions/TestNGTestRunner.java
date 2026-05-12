package CucumberOptions;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//plugin is to generate reports like html,json,extent
//Syntax:{type of report:where to save/name.type of report(file)}
//Extent Reports are written in a separate file in src/test/resources/extent.properties
@CucumberOptions(features = "src\\test\\java\\features", glue = "stepDefinitions", monochrome = true, tags = "@PlaceOrder or @OffersPage", plugin = {
		"html:target/test-output/Cucumber New Reports/cucumber.html",
		"json:target/test-output/Cucumber New Reports/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
