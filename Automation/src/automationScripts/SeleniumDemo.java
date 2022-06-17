package automationScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Open the web app
		driver.navigate().to("https://www.selenium.dev");
		String title = driver.getTitle();

		if (title.equalsIgnoreCase("selenium"))
			System.out.println("Title Matched");
		else
			System.out.println(title);

		// locate a web element
		String tagname = "";
		tagname = driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[2]/a")).getText();
		System.out.println(tagname);

		// open dropdown
		WebElement about = driver.findElement(By.linkText("About"));
		Actions actions = new Actions(driver);
		actions.moveToElement(about).perform();
		Thread.sleep(2000);

		WebElement aboutSelenium = driver.findElement(By.xpath("/html/body/header/nav/div/ul/li[2]/div/a[1]"));
		actions.moveToElement(aboutSelenium).click();
		actions.perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div[2]/div/a")).click();
		Thread.sleep(2000);

	}
}
