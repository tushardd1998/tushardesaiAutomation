package automationScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseDemo {

	// how to close all the browsers ?
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium.dev/");
		driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div/a")).click();
		Thread.sleep(4000);
		driver.quit();

	}
	
	//how to close only the parent window?
	
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://selenium.dev/");
	 * driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div/a")).click();
	 * Thread.sleep(4000); driver.close(); }
	 */
	
	

	// how to close all the browsers without quit method ?
	
	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * 
	 * System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("http://selenium.dev/");
	 * driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div/a")).click();
	 * 
	 * Set<String> allHandles = driver.getWindowHandles();
	 * 
	 * for(String wh:allHandles) { driver.switchTo().window(wh).close(); }
	 */
}
