package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebookSignInPage extends basePage {

	public facebookSignInPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailTxtBox;
	@FindBy(xpath = "//input[@id='pass']")
	WebElement passwordTxtBox;
	@FindBy(xpath = "//button[@id='loginbutton']")
	WebElement LogInBtn;
	
	public void clickLogIn()
	{
		LogInBtn.click();
	}
}
