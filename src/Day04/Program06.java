package Day04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program06 {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		driver =new ChromeDriver();
		driver.get("https://indianbank.in/#!");
		screenshot2("url");
		driver.findElement(By.xpath("//input[@class='searchInputText']")).sendKeys("Appliation form");
		screenshot2("searchtab");
		driver.findElement(By.xpath("//a[@href='https://indianbank.in/investors-services-ib/']")).click();
		screenshot2("investor");
		driver.get("https://indianbank.in/investors-services-ib/#!");
		screenshot2("investor page");		
		
	}

	private static void screenshot2(String FileName) throws Exception {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot2/"+FileName+".png");
		FileUtils.copyFile(src, dest);
		
	}

}
