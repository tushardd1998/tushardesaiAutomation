package actionClass;

import java.awt.Desktop.Action;
import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.className("M6CB1c rr4y5c")).click();
		driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Mouse Hover",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
		WebElement target = driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[2]/span"));
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(target).perform();
		
	}

}
