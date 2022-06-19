package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void a()
	{
		Reporter.log("demo class method",true);
	}
	
	@Test
	public void b()
	{
		Reporter.log("demo1 class method",true);
	}
	
	@Test
	public void c()
	{
		Reporter.log("demo2 class method",true);
	}
	
	@Test
	public void d()
	{
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
