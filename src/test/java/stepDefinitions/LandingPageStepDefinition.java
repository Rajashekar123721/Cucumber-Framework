package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;


//Concepts
//Single Responsibility Principle(SRP)
//Factory Designed Pattern

public class LandingPageStepDefinition {
	public WebDriver driver;
	public String landingPageProductName,offerPageProductName;
	
	TestContextSetup testcontextsetup;
	LandingPage landingPage;
	
//constructor(to implement from another class)
public LandingPageStepDefinition(TestContextSetup testcontextsetup) {
	this.testcontextsetup=testcontextsetup;
	this.landingPage=testcontextsetup.pageObjectManager.getLandingPage();
}
	
	
	
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() {
//		testcontextsetup.driver=new ChromeDriver();
//		System.out.println("Browser started");
//		testcontextsetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		testcontextsetup.driver.manage().window().maximize();
		
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}

	@When("^User searched with short name (.+) and gets the actual name of the product$")
	public void user_searched_with_short_name_and_gets_the_actual_name_of_the_product(String shortName) throws InterruptedException {
		//invoked from LandingPage class
		landingPage.searchItem(shortName);
		Thread.sleep(3000);
		// split is to split the words Tomato and 1 kg as it was seperated by "-" we can
		// used that as reference to split into 2.And [0] is to get the first string
		// that is Tomato.
		// trim() is to delete any spaces before or after the string.
		testcontextsetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
		System.out.println(testcontextsetup.landingPageProductName+" is extracted from homepage");
	}

	
	
	
	@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String quantity) {
		//parse int is to convert any data type to integer. as quantity is declared as string here in order to convert it to integer.
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}
}
