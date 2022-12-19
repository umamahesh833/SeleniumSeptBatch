package UITests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginTests {

	@Test
	public void TestLogin() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumSept\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://home.pearsonvue.com/bcs");
	}
	
	@Test
	public void TestLogOut() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumSept\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		
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
	
	@Test
	public void TesHomeScreen() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\SeleniumSept\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		
	}
	
	@Test
	public void TestAddtoCart() {
		
	System.out.println("added new test case");	
		
	}
	
	@Test
	public void TestValidatePrice() {
		
	System.out.println("Validation is success");	
		
	}
	
	
	

}
