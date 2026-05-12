//this is for general codes like window handles,waits,speed etc

package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {

	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	public void switchWindowToChild() {
	
	// browser opens on other window to get other window
	// s1 handle 2 windows as 1 so need to use iterator
	Set<String> s1 = driver.getWindowHandles();
	Iterator<String> i1 = s1.iterator();
	// to get 2nd window(child window)
	String ParentWindow = i1.next();
	String ChildWindow = i1.next();
	driver.switchTo().window(ChildWindow);
}
}