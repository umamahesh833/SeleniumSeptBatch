package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	By ElementSignIn = By.xpath(" //div[@class='panel header']/ul/li[2]/a");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void ClickSignIn() {
		WebElement login = driver.findElement(ElementSignIn);
		login.click();
	}

}
