package Assertionpack;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

//Assertionpack.NewTest

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("checking the cmd execution");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("start ");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("end");
  }

}
