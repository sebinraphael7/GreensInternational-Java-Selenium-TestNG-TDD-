package testCases;

import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.signPage;
import testBase.BaseClass;

public class TC_002_GmailAutoSignIn_invalid_data extends BaseClass {
@Test
public void verify_Gmail_AutoSignIn_valid()
{
	homePage hp=new homePage(driver);
	hp.clickSignIn();
	signPage sip=new signPage(driver);
	
}
}
