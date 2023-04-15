package Maven_Testing.Maven_Testing;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;


//Maven_Testing.Maven_Testing.NewTest
public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("my sample test");
  }
  
  @Test
  
  public void b()
  
  {
	  System.out.println("My sample test2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("My precondition before test annotation ");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("My postcondition before test annotation");
  }
  
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("Need a valid URL");
  }
  
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println("close the URL");
  }
  
  

}
