package keywordDriven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(4000);

		Flib flib = new Flib();
		String username = flib.readExceldata("./data/config.properties", "ValidSheet", 1, 0);
		String password = flib.readExceldata("./data/config.properties", "ValidSheet", 1, 1);

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		
		
		
		//flib.writeExcelData("./data/TestDataOrangeHRM.xlsx", "ValidSheet", 2, 0, "tushar");
		//flib.writeExcelData("./data/TestDataOrangeHRM.xlsx", "ValidSheet", 2, 1, "desai");

	}

}
