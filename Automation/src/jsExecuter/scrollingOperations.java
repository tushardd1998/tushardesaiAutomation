package jsExecuter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingOperations {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//driver.manage().window().maximize();
	driver.navigate().to("https://google.com/");
	driver.switchTo().activeElement().sendKeys("JkTech",Keys.ENTER);
	//driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(1000,0)");
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(-1000,0)");
	
}
}
