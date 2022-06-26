package testNGPack;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(description = "my test case for demo2 is passed")
	public void b()
	{
		Reporter.log("demo2 class method",true);
	}

}
