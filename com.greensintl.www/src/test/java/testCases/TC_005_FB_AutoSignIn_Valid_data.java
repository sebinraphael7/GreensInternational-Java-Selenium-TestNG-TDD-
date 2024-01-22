package testCases;

import org.testng.annotations.Test;

import pageObjects.homePage;
import pageObjects.signPage;
import testBase.BaseClass;

public class TC_005_FB_AutoSignIn_Valid_data extends BaseClass {
@Test
public void verify_FB_AutoSignIn()
{
	homePage hp=new homePage(driver);
	hp.clickSignIn();
	signPage sip=new signPage(driver);
//	sip.clickSigninWithFacebook();
}
}
