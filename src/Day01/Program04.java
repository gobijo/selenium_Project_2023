package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program04 {

	public static void main(String[] args) {
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		

}
}