package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement target = driver.findElement(By.xpath("//span[.='right click me']"));
		WebElement target2 = driver.findElement(By.xpath("//span[.='Quit']"));
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
		act.contextClick(target2).perform();
		driver.findElement(By.linkText("OK")).click();
		
		}

}
