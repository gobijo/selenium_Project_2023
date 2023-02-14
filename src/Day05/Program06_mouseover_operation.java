package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program06_mouseover_operation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement src= driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		WebElement electricCooker= driver.findElement(By.xpath("//span[text()='Electric Cookers']"));
		Actions x= new Actions(driver);
		x.moveToElement(src).click(electricCooker).build().perform();

}
}