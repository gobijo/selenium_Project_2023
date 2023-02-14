package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program03_dd {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement srcFrom= driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement desTo= driver.findElement(By.xpath("//span[text()='Quit']"));
		Actions actions= new Actions(driver);
		actions.contextClick(srcFrom).click(desTo).build().perform();
		
		
		
		
	}

}
