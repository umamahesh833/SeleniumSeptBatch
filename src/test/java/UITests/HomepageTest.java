package UITests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomepageTest {
	
	@Test
	public void TestHomepageTitle() {
		
		System.out.println("Home page tests");
	}
	
	@Test
	public void TestHomepageLink() {
		
		System.out.println("Home page link");
	}

	//@Test(priority = 6)
		public void AddToCart() {
			ObjMethods.fnLaunchApplication();
			ObjMethods.fnLogin();
			ObjMethods.fnNavToGearWatches();
			ObjMethods.FnSelectWatch();
			ObjMethods.fnGoToCart();
			ObjMethods.fnValidateProductName(By.xpath("//table[@id='shopping-cart-table']/tbody[2]/tr[1]/td[1]/div/strong"),
					                         "Aim Analog Watch");
			ObjMethods.fnValPrice(By.xpath("//table[@id='shopping-cart-table']/tbody[2]/tr[1]/td[4]/span/span/span"),
					                         "$45.00"); 
			ObjMethods.fnQuit();

			
		}
		public void fnGoToCart() {
			   WebElement cart = driver.findElement(By.xpath("//a[@class='action showcart']"));
			   Actions act = new Actions(driver); //Actions object creation
			   act.moveToElement(cart).build().perform();
			   cart.click();
			   WebElement viewEditcart = driver.findElement(By.xpath("//a[@class='action viewcart']"));
			   act.moveToElement(viewEditcart).build().perform();
			   viewEditcart.click();
		   }
		public void FnSelectWatch() {
		    WebElement selectWatch = driver.findElement(By.xpath("//ol[@class='products list items product-items']/li[9]/div"));
			selectWatch.click();
			WebElement addtocart = driver.findElement(By.xpath("//button[@class='action primary tocart']"));
			Actions act = new Actions(driver);
			act.moveToElement(addtocart).build().perform();
			addtocart.click();
		   
	   }
		public void fnNavToGearWatches() {
			WebElement gear = driver.findElement(By.xpath("//a[@id='ui-id-6']"));
			Actions Act = new Actions(driver);
			Act.moveToElement(gear).build().perform();
			WebElement watches = driver.findElement(By.xpath("//a[@id='ui-id-27']"));
			Act.moveToElement(watches).build().perform();
			watches.click();
			
			
			// Explicit wait
			//WebDriverWait wait = new WebDriverWait(driver, 120);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-27']")));
		}
	@Test
	public void TestHomepagefileds() {
		
		System.out.println("Home page fields");
	}
	
	
	@Test
	public void TestMyCartPage() {
		
		System.out.println("TestMyCartPage");
	}


}
