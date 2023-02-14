package Day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02_webTable_ex02 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
       List<WebElement> companyList = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[2]"));
		
		for(WebElement x:companyList)
		{
			System.out.println(x.getText());
		}
		System.out.println("<-------------------->");
		
		List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[4]"));
		for(WebElement x:CurrentPrice)
		{
		System.out.println(x.getText());
		}
        System.out.println("<-------------------->");
		
		List<WebElement> 	Change = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[5]"));
		for(WebElement x:	Change)
		{
		System.out.println(x.getText());
		
	}

	}

}
