package PageObjects;

import java.util.List;

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
	 public void Navigatetomen() {
			//Navigate to Men>Tops>Jackets
		WebElement Men=driver.findElement(By.id("ui-id-5"));
	    Actions Act=new Actions(driver);
	    Act.moveToElement(Men).build().perform();
		WebElement Tops=driver.findElement(By.id("ui-id-17"));
	    Act.moveToElement(Tops).build().perform();
		WebElement Jackets=driver.findElement(By.id("ui-id-19"));
		Jackets.click();
	    List<WebElement> beforesortname=driver.findElements(By.xpath("//strong[@class='product name product-item-name']"));
		System.out.println("    BEFORE SORTING ALBHABET ORDER ");
		for(int i=0;i<=beforesortname.size()-1;i++) {
		  String Beforename=beforesortname.get(i).getText();
		  System.out.println(Beforename+ " - "+Beforename.substring(0, 1));
		  }
	 }
	
	
	 public void navigateGear() {
			//navigate to Gear>Watches
		WebElement Gear=driver.findElement(By.id("ui-id-6"));
		Actions Act=new Actions(driver);
		Act.moveToElement(Gear).build().perform();
		WebElement Watches=driver.findElement(By.id("ui-id-27"));
		Watches.click();
					 }
	
	

}
