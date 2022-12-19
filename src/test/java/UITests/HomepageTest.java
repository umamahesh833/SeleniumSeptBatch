package UITests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Methods.BrowserMethods;
import PageObjects.CartPage;
import PageObjects.CustomerLoginPage;
import PageObjects.HomePage;
import PageObjects.HompageLogin;
import PageObjects.Watches;

public class HomepageTest {
	WebDriver driver;

	
	@BeforeMethod
	public void fnLaunchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSept\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	

	@Test(priority = 0)
	public void TestAddToCart() {
		BrowserMethods Browser = new BrowserMethods(driver);
		HomePage Homepage = new HomePage(driver);
		CustomerLoginPage LoginPage = new CustomerLoginPage(driver);
		HompageLogin LoginHomePage = new HompageLogin(driver);
		Watches WatchesPage = new Watches(driver);
		CartPage Cartpage = new CartPage(driver);
		
		
		
		Browser.fnMaximize();
		Browser.fnWaitTimes();
		Browser.fnNavigateURL();
		
		Homepage.ClickSignIn();
		
		LoginPage.EnterUsername();
		LoginPage.EnterPassword();
		LoginPage.ClicOnSignIn();
		
		LoginHomePage.fnNavToGearWatches();
		WatchesPage.fnSelectWatch();
		WatchesPage.fnGoToCart();
		
		Cartpage.FnValidateProductName(By.xpath("//table[@id='shopping-cart-table']/tbody[2]/tr[1]/td[1]/div/strong"),
				"Aim Analog Watch");
	
		Cartpage.FnValidatePrice(By.xpath("//table[@id='shopping-cart-table']/tbody[2]/tr[1]/td[4]/span/span/span"),
				"$45.00");

	}

}
