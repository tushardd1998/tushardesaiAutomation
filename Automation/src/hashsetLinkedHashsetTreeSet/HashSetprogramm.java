package hashsetLinkedHashsetTreeSet;

import java.lang.StackWalker.Option;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashSetprogramm {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
 	WebDriver driver=new ChromeDriver();
 	driver.manage().window().maximize();
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	driver.get("file:///C:/Users/tushar.desai/OneDrive%20-%20JK%20Technosoft%20Ltd/Desktop/selenium/Single%20Select%20Dropdown.html");
 	WebElement dropdownelement = driver.findElement(By.id("menu"));
 	Select sel = new Select(dropdownelement);
 	List<WebElement> options = sel.getOptions();
    HashSet<String> s = new HashSet<String>();
    
  for(int i=0;i<options.size();i++)
  {
	  WebElement ops = options.get(i);
	  String text = ops.getText();
	  s.add(text);
  }
  for(String se:s)
  {
	  System.out.println(se);
  }
}
}
