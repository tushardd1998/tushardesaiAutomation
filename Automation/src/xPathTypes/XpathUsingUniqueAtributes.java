package xPathTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingUniqueAtributes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//login operation
		
		driver.findElement(By.xpath("//input[contains(@id,'txtPass')]")).sendKeys("Pass@123");
		
				
		
		/*
		 * driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin"
		 * );//type username
		 * driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(
		 * "admin123");//type password
		 * driver.findElement(By.xpath("//input[@id='btnLogin']")).click();//click on
		 * login button
		 */			
	}

}
