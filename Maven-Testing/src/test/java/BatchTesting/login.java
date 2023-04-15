package BatchTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class login {
	
	@Test()
	public void email()
	{
		System.out.println("login with email");
		Assert.assertEquals("pavan", "pavan");
	}
	
	@Test
	public void fb()
	{
		System.out.println("login with facebook");
		Assert.assertEquals("sush", "hari");
	}

}
