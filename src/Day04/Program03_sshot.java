package Day04;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program03_sshot {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		File firstsrc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png");
		FileUtils.copyFile(firstsrc,dest);
		driver.quit();

	

	
		
	}

}
