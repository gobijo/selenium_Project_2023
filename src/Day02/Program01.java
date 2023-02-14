package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vibu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("vishanth");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pondicherry-01");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='Male']")).click(); //if .click(); again then only it remove the tick mark
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear(); //if any text option u can remove then type ".clear();
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
}
}
