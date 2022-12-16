package UITests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomepageTest {
	LoginTests ObjMethods = new LoginTests();

	@Test
	public void TestHomepageTitle() {

		System.out.println("Home page tests");
	}

	@Test
	public void TestHomepageLink() {

		System.out.println("Home page link");
	}

	@Test
	public void TestHomepagefileds() {

		System.out.println("Home page fields");
	}

	@Test
	public void TestMyCartPage() {

		System.out.println("TestMyCartPage");
	}

	@Test(priority = 0)
	public void AddToCart() {
		ObjMethods.fnLaunchApplication();
		ObjMethods.fnLogin();
		ObjMethods.fnNavToGearWatches();
		ObjMethods.fnSelectWatch();
		ObjMethods.fnGoToCart();
		ObjMethods.fnValidateProductName(By.xpath("//table[@id='shopping-cart-table']/tbody[2]/tr[1]/td[1]/div/strong"),
				"Aim Analog Watch");
		ObjMethods.fnValPrice(By.xpath("//table[@id='shopping-cart-table']/tbody[2]/tr[1]/td[4]/span/span/span"),
				"$45.00");
		ObjMethods.fnQuit();

	}

}
