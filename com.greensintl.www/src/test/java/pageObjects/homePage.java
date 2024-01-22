package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends basePage {
	 WebDriver driver;
	public homePage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//p[@class='item-label']")
	WebElement lnksignIn;
	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	WebElement toastmsg;
	
	public void clickSignIn()
	{
		System.out.println("ssss");
		lnksignIn.click();
	}
	public String getToastmessage()
	{
		try {
			System.out.println("yyy");
		String msg = toastmsg.getText();
		return msg;
		}catch(Exception e) {
		return (e.getMessage());
		}
	}
}
