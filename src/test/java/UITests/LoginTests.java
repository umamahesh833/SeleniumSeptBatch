package UITests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginTests {
	WebDriver driver;

	@Test
	public void TesHomeScreen() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSept\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

	@Test
	public void TestLogin() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSept\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://home.pearsonvue.com/bcs");
	}

	@Test
	public void TestLogOut() {

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSept\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

	@Test
	public void TestAddtoCart() {

		System.out.println("added new test case");

	}

	public void fnLaunchApplication() {

		System.setProperty("webdriver.chrome.driver", "/Users/vanimadhurisinangaram/Testing Softwares/chromedriver");
		driver = new ChromeDriver();
		// Maximizing the window
		driver.manage().window().maximize();
		// pageloadtimeout wait
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Application URL
		driver.navigate().to("https://magento.softwaretestingboard.com/");
	}

	public void fnLogin() {

		WebElement login = driver.findElement(By.xpath(" //div[@class='panel header']/ul/li[2]/a"));
		login.click();

		WebElement email = driver.findElement(By.xpath("//input[@name='login[username]']"));
		email.sendKeys("vani.madhuri25@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@name='login[password]']"));
		pass.sendKeys("$oftwareTesting");

		WebElement signin = driver.findElement(By.xpath("//button[@class='action login primary']/span"));
		signin.click();

	}

	public void fnGoToCart() {
		WebElement cart = driver.findElement(By.xpath("//a[@class='action showcart']"));
		Actions act = new Actions(driver); // Actions object creation
		act.moveToElement(cart).build().perform();
		cart.click();
		WebElement viewEditcart = driver.findElement(By.xpath("//a[@class='action viewcart']"));
		act.moveToElement(viewEditcart).build().perform();
		viewEditcart.click();
	}

	public void fnNavToGearWatches() {
		WebElement gear = driver.findElement(By.xpath("//a[@id='ui-id-6']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(gear).build().perform();
		WebElement watches = driver.findElement(By.xpath("//a[@id='ui-id-27']"));
		Act.moveToElement(watches).build().perform();
		watches.click();

	}

	public void fnSelectWatch() {
		WebElement selectWatch = driver
				.findElement(By.xpath("//ol[@class='products list items product-items']/li[9]/div"));
		selectWatch.click();
		WebElement addtocart = driver.findElement(By.xpath("//button[@class='action primary tocart']"));
		Actions act = new Actions(driver);
		act.moveToElement(addtocart).build().perform();
		addtocart.click();

	}

	public void fnValidateProductName(By Loc, String one) {
		WebElement prdName = driver
				.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody[2]/tr[1]/td[1]/div/strong"));
		String str = prdName.getText();
		System.out.println(str);
		if (str.contains(one)) {
			System.out.println("Product Name is same");
		}
	}

	public void fnValPrice(By locator, String one) {
		WebElement valPrice = driver.findElement(locator); // By.xpath("//span[@class='cart-price']/span")
		String str = valPrice.getText();
		System.out.println(str);

		if (str.contains(one)) {
			System.out.println("validation is pass");
		} else {
			System.out.println("validation is fail");
		}
	}

	public void fnQuit() {
		driver.quit();
	}

}
