package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class googleSignInPage extends basePage {
	public googleSignInPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement emailtxtbx;
	@FindBy(xpath = "//span[text()='Next']")
	WebElement nxtbtn;
	@FindBy(xpath = "//input[@name='Passwd']")
	WebElement pswdtxtbx;
	@FindBy(xpath = "//span[text()='Next']")
	WebElement pswdnxtbtn;
	
	public void setEmail(String email) {
		emailtxtbx.sendKeys(email);
	}
	public void clickNext()
	{
		nxtbtn.click();
	}
	public void setPassword(String pswd)
	{
		pswdtxtbx.sendKeys(pswd);
	}
	public void clickpswdNext()
	{
		pswdnxtbtn.click();
	}
}
