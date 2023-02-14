package Day04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Program04_sshot02 {
	
	static WebDriver driver;
	public static void main(String[]args) throws Exception {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		snapshot("application");
		driver.findElement(By.xpath("//h2[@class='a-color-base headline truncate-2line']"));
		snapshot("offer sale");
		driver.findElement(By.xpath("//div[@class='a-section a-spacing-none feed-carousel']"));
		snapshot("image03");
		
		
	}
	public static void snapshot(String fileName) throws Exception {
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des =new File("./snapshot/"+fileName+".png");
		FileUtils.copyFile(src,des);
		
		
		
		
	}
	
}