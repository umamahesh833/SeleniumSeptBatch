package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Watches {
	
	WebDriver driver;
	
	
	public Watches(WebDriver driver) {
		this.driver = driver;
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
	
	public void fnGoToCart() {
		WebElement cart = driver.findElement(By.xpath("//a[@class='action showcart']"));
		Actions act = new Actions(driver); // Actions object creation
		act.moveToElement(cart).build().perform();
		cart.click();
		WebElement viewEditcart = driver.findElement(By.xpath("//a[@class='action viewcart']"));
		act.moveToElement(viewEditcart).build().perform();
		viewEditcart.click();
	}

}
