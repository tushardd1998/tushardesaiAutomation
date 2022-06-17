package operationalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tushar.desai/OneDrive%20-%20JK%20Technosoft%20Ltd/Desktop/selenium/Single%20Select%20Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);
		for(int i=3;i<=9;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		List<WebElement> allopt = sel.getAllSelectedOptions();
		
		for(WebElement we:allopt)
		{
			String opt = we.getText();
			System.out.println(opt);
		}
		
	}
}
