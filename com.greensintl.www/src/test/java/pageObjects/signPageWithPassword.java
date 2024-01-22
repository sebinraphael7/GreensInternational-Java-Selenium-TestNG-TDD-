package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signPageWithPassword extends basePage{
	WebDriver driver;
	public signPageWithPassword(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy (xpath = "//input[@placeholder='Email Address']")
	WebElement emailTxtBox;
	@FindBy (xpath = "//input[@placeholder='Password']")
	WebElement pswdTxtBox;
	@FindBy (xpath = "//p[normalize-space()='Keep me signed in']")
	WebElement keepSinchbx;
	@FindBy (xpath = "//div[normalize-space()='Sign in']")
	WebElement lnkSignin;
	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	WebElement toastMsg;
	
	public void setEmail(String email)
	{
		emailTxtBox.sendKeys(email);
	}
	public void setPassword(String pswd)
	{
		pswdTxtBox.sendKeys(pswd);
	}
	public void clickKeepMeSignInChBx()
	{
		keepSinchbx.click();
	}
	public void clickSigninBtn()
	{
		lnkSignin.click();
	}
	public String getToastMsg()
	{
		String str=toastMsg.getText();
		return str;
	}
	

}
