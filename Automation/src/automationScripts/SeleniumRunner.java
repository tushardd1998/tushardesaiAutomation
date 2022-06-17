package automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRunner {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://github.com");
		driver.findElement(By.className("form-control input-sm header-search-input jump-to-field js-jump-to-field js-site-search-focus")).sendKeys(Keys.ENTER);
		
		
	}

}
