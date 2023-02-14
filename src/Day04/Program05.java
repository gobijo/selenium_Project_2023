package Day04;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Program05 {
	 static WebDriver driver;
		public static void main(String[] args) throws Exception{
			driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Register.html");
			screenShot("application");
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("TestFirstName");
			screenShot("firstName");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("TestLN");
			screenShot("lastName");
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Chennai-06");
			screenShot("address");
			driver.findElement(By.xpath("//input[@value='Male']")).click();
			screenShot("gender");
			driver.findElement(By.xpath("//input[@value='Cricket']")).click();
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
			
		}
		
		public static void screenShot(String fileName) throws Exception
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des= new File("./screenShot/"+fileName+".png");
			FileUtils.copyFile(src, des);
		}

	}

