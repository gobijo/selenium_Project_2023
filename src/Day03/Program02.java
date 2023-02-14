package Day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program02 {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.automationtesting.in/Register.html");
      driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("gobijo");
      driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Jalendran");
      driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Pondicherry-01");
      driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("gobijo.21@gmail.com");
      driver.findElement(By.xpath("//input[@value='Male']")).click();
      driver.findElement(By.xpath("//input[@value='Cricket']")).click();
      Select dropdownSkill = new Select(driver.findElement(By.xpath("//select[@id='Skills']")));
      dropdownSkill.selectByIndex(9);
      
	}

}
