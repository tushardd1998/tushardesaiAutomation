package xPathTypes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDesc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://selenium.dev/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[.='API Docs'])[3]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("navbarDropdown")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[2]/div/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div[2]/div/a")).click();
		Thread.sleep(2000);
		
		String at = driver.getTitle();
		System.out.println(at);
		String et ="History | Selenium";
		
		if(et.equalsIgnoreCase(at))
		{
			System.out.println("Test Successful");
		}
		else
		{
			System.out.println("Test Failure");
		}
		driver.close();
	     		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"navbarDropdown\"]")).click();
		 * driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/div/a[1]")).
		 * click();
		 */
	}
}
