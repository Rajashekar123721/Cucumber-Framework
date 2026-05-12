
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
  public WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By CartBag=By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");


	By CheckOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By PromoButton=By.cssSelector(".promoBtn");
	By PlaceOrder=By.xpath("//button[contains(text(),'Place Order')]");
	
	
	
	
	public void CheckOutItems() {
		driver.findElement(CartBag).click();
		driver.findElement(CheckOutButton).click();
	}

public boolean VerifyPromo() {
	return driver.findElement(PromoButton).isDisplayed();
}

public boolean VerifyPlaceOrder() {
	return driver.findElement(PlaceOrder).isDisplayed();
}

	
}
