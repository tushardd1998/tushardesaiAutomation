package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hongkiat.com/blog/websites-creative-mouse-over-effects/");
		WebElement target = driver.findElement(By.id("technology-menu"));
		WebElement target2 = driver.findElement(By.id("inspiration-menu"));
		
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		Thread.sleep(4000);
		act.moveToElement(target2).perform();
		driver.close();
	}
}
