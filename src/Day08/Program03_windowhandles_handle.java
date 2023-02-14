package Day08;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program03_windowhandles_handle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");	  
	    Select dropDown = new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		 dropDown.selectByValue("search-alias=stripbooks");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("selenium with java automation testing books"+Keys.ENTER);
		 driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		 
		 Set<String> windowIds= driver.getWindowHandles();
		 String parentwindow= driver.getWindowHandle();
		 for(String id:windowIds) {
		 driver.switchTo().window(id);
	     if(driver.getTitle().contains("Selenium Testing Tools Interview Questions You'll Most Likely Be Asked: Second Edition"))
	     {
		 Select dropQty= new Select(driver.findElement(By.xpath("//select[@id='quantity']")));
		 dropQty.selectByValue("7");
	     driver.findElement(By.id("add-to-cart-button")).click(); 
	
	     driver.switchTo().window(parentwindow);
	     driver.findElement(By.xpath("//span[text()='One Stop Solution to Test Automation Using Java Selenium']")).click();
	     
	     int handles= driver.getWindowHandles().size();
	     System.out.println(handles);
	    	 
		}
	  
	     }
	     }
	
	
			 
	     
		 }
	


