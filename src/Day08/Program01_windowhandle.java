package Day08;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program01_windowhandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");	  
	    Select dropDown = new Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		 dropDown.selectByValue("search-alias=stripbooks");
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("selenium with java automation testing books"+Keys.ENTER);
		 driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		 
		 Set<String> windowIds= driver.getWindowHandles();
		
		 for(String id:windowIds) {
			 driver.switchTo().window(id);
	         System.out.println(driver.getTitle());
			 System.out.println(id+"----------"+driver.getTitle()); //("if u want with title id so u can apply this print type")
			
	}
	}
	}