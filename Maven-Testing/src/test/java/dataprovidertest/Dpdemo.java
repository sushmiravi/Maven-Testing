package dataprovidertest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dpdemo {
	
	// syntax of data provider  
	@DataProvider(name ="dataprovider")// it accepts string name  
	public Object[][] datamethod()
	{
		return new Object[][] {{"value1"}, {"sushmi"}}; 
	}
		
	@Test(dataProvider= "Dpdemo2", dataProviderClass= Dpdem2.class)
	public void f1(String name, String pass, String valid)
	{
		System.out.println("the user loggin details");
		System.out.println("the user name" +name);
		System.out.println("the user password" +pass);
		System.out.println("pass or fail " +valid);
	}

}
