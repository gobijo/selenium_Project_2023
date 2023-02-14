package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program05 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");		
		WebElement src= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions= new Actions(driver);
		actions.doubleClick(src).build().perform();
		
	}

}
