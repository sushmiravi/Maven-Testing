package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


//Annotations.Annotationsdemo
public class Annotationsdemo {
  @Test
  public void m1() {
	  
	  System.out.println("My first test case: 1");
  }
  
  @Test
  public void m2()
  {
	  System.out.println("My first test case: 2");  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("My precondition method"); 
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("My postcondition method"); 
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("My precondition class"); 
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("My postcondition class"); 
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("My precondition test"); 
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("My postcondition test"); 
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("My testcase collection"); 
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("My testcase reports"); 
  }

}
