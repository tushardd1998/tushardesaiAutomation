package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.findElement(By.xpath("https://demo.guru99.com/test/simple_context_menu.html")).click();
		driver.findElement(By.xpath("//a[.='Drag and Drop Action']")).click();
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement target = driver.findElement(By.id("amt7"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
}
