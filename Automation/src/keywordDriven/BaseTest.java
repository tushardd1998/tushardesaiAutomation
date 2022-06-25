package keywordDriven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

	static WebDriver driver;
	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		// read the data from property file (browser)12334
		String browserValue = flib.readPropertyFile("PROP_PATH", "browser");
		
		//String browserValue1 = flib.readPropertyFile("./data/config.properties", "browser");
		
		// read the data from property file (url)
		String url = flib.readPropertyFile("PROP_PATH", "url");
		//String url = flib.readPropertyFile("./data/config.properties", "url");
		
		// use the value of browser
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("CHROME_KEY", "CHROME_VALUE");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		} 
		else if (browserValue.equalsIgnoreCase("edge")) {
			System.setProperty("EDGE_KEY", "EDGE_VALUE");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		}

		else {
			System.out.println("enter the correct choice");
		}
		
	}
	public void closeBrowser()
	{
		driver.close();
	}

}
