package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/tushar.desai/OneDrive%20-%20JK%20Technosoft%20Ltd/Desktop/selenium/Single%20Select%20Dropdown.html");
		driver.manage().window().maximize();
		WebElement dropdownElement = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdownElement);
		Thread.sleep(4000);
		sel.selectByIndex(6);
		//Test
	}

}
