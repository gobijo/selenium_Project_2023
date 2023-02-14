package Day07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program03_webTable_ex03 {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> companyList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		int row=1;
		for(WebElement x:companyList)
		{
		if(x.getText().contains("YES Bank Ltd."))
		{
		break;
		}
		row++;
		}
		System.out.println(row);

		List<WebElement> yesBankCompanyList= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr["+row+"]//td"));
		
		
		for (WebElement x : yesBankCompanyList) {
			System.out.println(x.getText());
		}
		
		

	}

}
