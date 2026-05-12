package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;



public class CheckoutPageStepDefinition {
	public WebDriver driver;
	public String landingPageProductName,offerPageProductName;
	public CheckoutPage checkoutPage;
	TestContextSetup testcontextsetup;
	
//constructor(to implement from another class)
public CheckoutPageStepDefinition(TestContextSetup testcontextsetup) {
	this.testcontextsetup=testcontextsetup;
	this.checkoutPage=testcontextsetup.pageObjectManager.getCheckoutPage();
}
	
@Then("Verify user has ability to enter the promo code and place the order.")
public void Verify_user_has_ability_to_enter_the_promo_code() {

	Assert.assertTrue(checkoutPage.VerifyPromo());
	Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
}
	
@Then("^User proceeds to checkout and validate the (.+) items in checkout page$")
public void User_proceeds_to_checkout_and_validate_names(String name)throws InterruptedException{
		
		checkoutPage.CheckOutItems();
		//Assertion to extract name from screen and compare with name
	}

}
