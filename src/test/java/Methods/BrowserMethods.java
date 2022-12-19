package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	
	WebDriver driver;
	
	
	public BrowserMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void fnMaximize() {
		// Maximizing the window
		driver.manage().window().maximize();

	}
	
	public void fnWaitTimes() {
		// pageloadtimeout wait
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	public void fnNavigateURL() {
		// Application URL
		driver.navigate().to("https://magento.softwaretestingboard.com/");
	}
	
	
	public void fnquit() {
		driver.quit();
	}

}
