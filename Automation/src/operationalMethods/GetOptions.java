package operationalMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tushar.desai/OneDrive%20-%20JK%20Technosoft%20Ltd/Desktop/selenium/Single%20Select%20Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);
		List<WebElement> options = sel.getOptions();
		/*
		 * for (int i = 0; i <= options.size(); i++) { String text =
		 * options.get(i).getText(); System.out.println(text);
		 * 
		 * }
		 */
		for(WebElement we:options)
		{
			String text = we.getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
