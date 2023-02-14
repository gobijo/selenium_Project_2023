package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program01_dragndrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src =driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement des =driver.findElement(By.xpath("//ol[@id='bank']")); 		
		Actions action= new Actions(driver);
		action.dragAndDrop(src, des).build().perform();		
		
		WebElement srcSale= driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement desSale= driver.findElement(By.xpath("//ol[@id='loan']"));
		action.dragAndDrop(srcSale, desSale).build().perform();
		
	}
}
