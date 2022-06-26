package testNGPack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test(description = "my test case a is passed")
	public void a()
	{
		Assert.fail();
		Reporter.log("demo class method",true);
	}
	
	@Test(enabled = true)
	public void b()
	{
		Reporter.log("demo1 class method",true);
	}
	
	@Test(priority = 0)
	public void c()
	{
		Reporter.log("demo2 class method",true);
	}
	
	@Test(dependsOnMethods = "a",alwaysRun = true)
	public void d()
	{
		//Assert.fail();
		Reporter.log("demo3 class method",true);
	}
	
	@Test
	public void e()
	{
		Reporter.log("demo4 class method",true);
	}
	
	@Test
	public void f()
	{
		//Assert.fail();
		Reporter.log("demo5 class method",true);
	}

}
