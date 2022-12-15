package UITests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

}
