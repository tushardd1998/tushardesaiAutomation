package jsExecuter;

import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Open the web app
		driver.navigate().to("https://www.selenium.dev");
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy (0,1000)");
	}
}
