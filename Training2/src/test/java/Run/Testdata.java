package Run;

import org.testng.annotations.Test;

import Com.pages.Home;
import common.browsers;

import org.testng.annotations.DataProvider;

public class Testdata extends browsers{
  @Test(dataProvider = "signin")
  public void f(String n, String s) {
	  Home h=new Home(driver);
	  h.Emailidfield(n);
	  h.pssword();
	  h.loginbutton();
	  driver.navigate().back();
	  h.empty();
	  
  }
  
  

  @DataProvider
  public Object[][] signin() {
    return new Object[][] {
      new Object[] { "", "a" },
      new Object[] { "Karim@yahoo.com", "b" },
      new Object[] {"sharaf@gmail.com","C"}
    };
  }
}
