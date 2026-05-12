//To save all the objects from both stepDefinitions

package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	private WebDriver driver;
	LandingPage landingPage;
	OffersPage offersPage;
	CheckoutPage checkoutPage;
	
	public PageObjectManager(WebDriver driver){
		this.driver=driver;
	}
	public LandingPage getLandingPage() {

		return landingPage=new LandingPage(driver);
	}
	
	public OffersPage getOffersPage() {

		return offersPage=new OffersPage(driver);
		}
	
	public CheckoutPage getCheckoutPage() {

		return checkoutPage=new CheckoutPage(driver);
	}
}
