//this class is for dependency injection(we need to store/initialize common things/declarations  of stepdefinition files in this class file)

//this is need to be done in this way because when we have many testcases we need to divide them into diff step definition files otherwise it will become messy.

//after adding cucumber-picocontainer dependency in pom file this class need to be created and injected as constructor in step definition files.
package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
		testBase =new TestBase();
		pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		
		genericUtils=new GenericUtils(testBase.WebDriverManager());
	}
}
