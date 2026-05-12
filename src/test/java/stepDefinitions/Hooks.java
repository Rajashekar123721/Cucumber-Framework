package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	 TestContextSetup testcontextsetup;

	public Hooks(TestContextSetup testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	
	@After
	public void AfterScenario() throws IOException {
		testcontextsetup.testBase.WebDriverManager().quit();
	}
	
	//Scenario is inbuilt class
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver=testcontextsetup.testBase.WebDriverManager();
		if(scenario.isFailed()){
			//screenshot
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//to change from file to byte for that we have do add dependency called apache commons io
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent,"image/png","image");
		}
		
	}
}
