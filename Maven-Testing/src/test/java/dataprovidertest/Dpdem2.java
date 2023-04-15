package dataprovidertest;

import org.testng.annotations.DataProvider;

public class Dpdem2 {
	
	@DataProvider(name = "Dpdemo2")
	public Object[][] demo()
	{
		return new Object[][] {{"sush@gmail.com" , "1234","valid"},
		 {"darsh@gmail.com","6789","notvalid"}};
	}

}
