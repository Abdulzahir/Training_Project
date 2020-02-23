package Run;

import org.testng.annotations.Test;

import Com.pages.Home;
import common.browsers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Home_Site extends browsers {
	
  @Test
  
  public void f()  {
	  Home h=new Home(driver);
	  h.Emailidfield("zshafaqh@gmail.com");
	  h.pssword();
	  h.loginbutton();
	  driver.navigate().back();
	  
  }
 

}
