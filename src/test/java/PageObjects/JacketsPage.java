package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class JacketsPage {
WebDriver driver;
	
	
	public JacketsPage(WebDriver driver) {
		this.driver = driver;
	}

	 public void Sort() {
			//Sort by Product Name
		    WebElement Dropdown=driver.findElement(By.xpath("//select[@id='sorter']"));
		    Select select=new Select(Dropdown);
			select.selectByValue("name");
		    List<WebElement> Aftersortname=driver.findElements(By.xpath("//strong[@class='product name product-item-name']"));
		    System.out.println("    AFTER SORTING ALBHABET ORDER ");
		    for(int i=0;i<=Aftersortname.size()-1;i++) {
				  String Aftername=Aftersortname.get(i).getText();
				  System.out.println(Aftername+ " - "+Aftername.substring(0, 1));
		 }
	 }
}