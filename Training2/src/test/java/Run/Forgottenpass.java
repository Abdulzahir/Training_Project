package Run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgottenpass {
	WebDriver driver;
	
	@FindBy (id="identify_email")
	WebElement forgotid;
	
	@FindBy (name="did_submit")
	WebElement searchbutton;
	
	@FindBy (linkText="Cancel")
	WebElement cancel;
	
	public Forgottenpass(WebDriver driver) {
	this.driver=driver;	
	PageFactory.initElements(driver, this);

}
	public void forgetfield(String id) {
		forgotid.sendKeys(id);
		
	}
	public void searchbt() {
	searchbutton.click();
	
}
	public void cancel() {
	cancel.click();
}
}