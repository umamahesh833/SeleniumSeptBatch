package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLoginPage {
	WebDriver driver;
	
	By UserName = By.xpath("//input[@name='login[username]']");
	By Password = By.xpath("//input[@name='login[password]']");
	By SignIn = By.xpath("//button[@class='action login primary']/span");
	
	
	
	
	public CustomerLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	



	public void EnterUsername() {
		WebElement email = driver.findElement(UserName);
		email.sendKeys("vani.madhuri25@gmail.com");


	}
	
	public void EnterPassword() {
		WebElement pass = driver.findElement(Password);
		pass.sendKeys("$oftwareTesting");

	}
	
	public void ClicOnSignIn() {

		WebElement signin = driver.findElement(SignIn);
		signin.click();
	}
	
	
	
	
	
	

}
