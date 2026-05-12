//For webdriver object

package Utils;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

import pageObjects.LandingPage;

public class TestBase {

	public WebDriver driver;
	
	
//	public WebDriver WebDriverManager() throws IOException 
//	{
//	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//	String url = prop.getProperty("QAUrl");
//	String browser_properties = prop.getProperty("browser");
//	String browser_maven=System.getProperty("browser");
//		// result = testCondition ? value1 : value2
//		
//		String browser = browser_maven!=null ? browser_maven : browser_properties;
//
//				if(driver == null)
//	{
//			if(browser.equalsIgnoreCase("chrome"))
//			{
//		System.setProperty("webdriver.chrome.driver","D:\\Automation Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver");
//		driver = new ChromeDriver();// driver gets the life
//			}
//			if(browser.equalsIgnoreCase("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver","D:\\Automation Selenium\\geckodriver-v0.33.0-win64\\geckodriver");
//				driver = new FirefoxDriver();
//			}
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get(url);
//	}
//	
//		return driver;
//		
//	}
//	
	
	
	
	

	
	public WebDriver WebDriverManager() {
		
		
		if(driver==null) {
            // Ensure a matching ChromeDriver is downloaded for the installed Chrome
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Browser started");
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }


}
