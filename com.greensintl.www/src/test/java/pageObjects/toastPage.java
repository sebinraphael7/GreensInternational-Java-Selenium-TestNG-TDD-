package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class toastPage extends basePage {
	WebDriver driver;
	public toastPage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath = "//div[@class='Toastify__toast-body']")
	WebElement toastMsg;
	public String getToastMsg()
	{
		System.out.println("eee");
		String str=toastMsg.getText();
		return str;
	}
}
