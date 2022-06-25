package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMInvalid {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);

		Flib flib = new Flib();
		int rc = flib.rowCount("./data/TestDataOrangeHRM.xlsx", "InvalidSheet");
		for (int i = 1; i <= rc; i++) {
			String username = flib.readExceldata("./data/TestDataOrangeHRM.xlsx", "InvalidSheet", i, 0);
			String password = flib.readExceldata("./data/TestDataOrangeHRM.xlsx", "InvalidSheet", i, 1);

			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		}
	}
}
