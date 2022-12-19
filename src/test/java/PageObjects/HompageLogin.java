package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HompageLogin {
	WebDriver driver;
	
	
	public HompageLogin(WebDriver driver) {
		this.driver = driver;
	}
	
	public void fnNavToGearWatches() {
		WebElement gear = driver.findElement(By.xpath("//a[@id='ui-id-6']"));
		Actions Act = new Actions(driver);
		Act.moveToElement(gear).build().perform();
		WebElement watches = driver.findElement(By.xpath("//a[@id='ui-id-27']"));
		Act.moveToElement(watches).build().perform();
		watches.click();

	}
	
	
	
	
	
	

}
