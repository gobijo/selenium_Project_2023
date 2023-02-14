package Day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class programxxxxxxxxxx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> HeaderList= driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		for(WebElement x:HeaderList)
		{
			System.out.println(x.getText());
		}
		System.out.println("<------------------------------------->");
		List<WebElement> companyList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		for(WebElement x:companyList)
		{
			System.out.println(x.getText());
		}
		System.out.println("<------------------------------------->");
		
		List<WebElement> companyname= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		int row=1;
		for(WebElement x:companyname)
		{
		if(x.getText().contains("UCO Bank"))
		{
		break;
		}
		row++;
		}
		System.out.println(row);
	   
	List<WebElement>UCOBankList = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr["+row+"]//td"));
		for(WebElement x:UCOBankList)
		{
			System.out.println(x.getText());
		}

	}

}
