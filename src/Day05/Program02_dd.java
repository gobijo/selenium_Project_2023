package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program02_dd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement des = driver.findElement(By.xpath("//ol[@id='amt7']"));
		Actions x= new Actions(driver);
		//x.dragAndDrop(src, des).build().perform();  	
		x.clickAndHold(src).moveToElement(des).release(des).build().perform(); //2nd method procedure
		

	}

}