package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CartPage {
	
	WebDriver driver;
	
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void FnValidateProductName(By Loc, String one) {
		WebElement prdName = driver
				.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody[2]/tr[1]/td[1]/div/strong"));
		String str = prdName.getText();
		System.out.println(str);
		if (str.contains(one)) {
			System.out.println("Product Name is same");
		}
	
	}
	
	
	public void FnValidatePrice(By Loc, String one) {
		WebElement valPrice = driver.findElement(Loc); // By.xpath("//span[@class='cart-price']/span")
		String str = valPrice.getText();
		System.out.println(str);

		if (str.contains(one)) {
			System.out.println("validation is pass");
		} else {
			System.out.println("validation is fail");
		}

	}
	


	


}
