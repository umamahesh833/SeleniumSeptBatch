package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {
WebDriver driver;
	
	
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	 public void Review() throws Exception {
//Click on item
		  WebElement ClamberWatch=driver.findElement(By.linkText("Clamber Watch"));
		  ClamberWatch.click();
//Add my Review
		  WebElement Review=driver.findElement(By.linkText("Add Your Review"));
          Review.click();
		  WebElement Star1=driver.findElement(By.xpath("//label[@class='rating-1']"));
		  Actions Act=new Actions(driver);
		  Act.moveToElement(Star1).build().perform();
		  Star1.click();
	    
		   Thread.sleep(2000);
		   WebElement Summary=driver.findElement(By.xpath("//input[@id='summary_field']"));
		   Summary.sendKeys("Good product");
		   Thread.sleep(2000);
		   WebElement REview=driver.findElement(By.id("review_field"));
    		REview.sendKeys("Value for money.Thought to by another one for my Friend.");
		WebElement Submit=driver.findElement(By.xpath("//button[@class='action submit primary']"));
			 Submit.click();
			 
		 }
	 public void ValidateReview() {
	//Validate my review  by Date
		 WebElement Downbutton=driver.findElement(By.xpath("//button[@class='action switch']"));
		 Downbutton.click();
		 WebElement MyAccount=driver.findElement(By.linkText("My Account"));
		 MyAccount.click();
		 WebElement MyOrderReview=driver.findElement(By.linkText("My Product Reviews"));
		 MyOrderReview.click();

		 WebElement TableDate=driver.findElement(By.xpath("//table[@id='my-reviews-table']/tbody/tr[1]/td[1]"));
		 System.out.println("Review given Date Captured - "+TableDate.getText());
      driver.close();
	 }
}
