package Com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Page Object Model create
public class Home {
	//This is global variable
	WebDriver driver;
	
	//1- Initialize or locate the elements
@FindBy (name="email")
WebElement userid;
@FindBy(name="pass")
WebElement pssword;
@FindBy(xpath="//*[@aria-label='Log In']")
WebElement loginbutton;
@FindBy(linkText="Forgot account?")
WebElement forgotlk;

 //2- Create page factor Constructor
public Home (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

//3-Create Method according to action
public void Emailidfield(String enteridmail) {
	userid.sendKeys(enteridmail);
	
}

public void pssword() {
	pssword.sendKeys("AbdulZahir");
	
}
public void loginbutton() {
	loginbutton.click();
	
}

public void Forgottenpass() {
forgotlk.click();
    
}

public void empty() {
	// TODO Auto-generated method stub
	
}


}