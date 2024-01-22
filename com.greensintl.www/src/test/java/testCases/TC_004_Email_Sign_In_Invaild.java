package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.homePage;
import pageObjects.signPage;
import pageObjects.signPageWithPassword;
import pageObjects.toastPage;
import testBase.BaseClass;

public class TC_004_Email_Sign_In_Invaild extends BaseClass {
	@Test
	public void verify_Email_Login_Invalid() throws Throwable
	{
		homePage hp=new homePage(driver);
		hp.clickSignIn();
		signPage sip=new signPage(driver);
		sip.clickUseEmailAddress();
		signPageWithPassword spwp=new signPageWithPassword(driver);
		spwp.setEmail("testerrllp5@gmail.com");
		spwp.setPassword("Tester123#1");
		spwp.clickSigninBtn();
		toastPage tp=new toastPage(driver);
		Thread.sleep(2000);
		String st = tp.getToastMsg();
		System.out.println(st);
		String st2 = "User not found!, please login again";
		SoftAssert s=new SoftAssert();
		s.assertEquals(st,st2);
		s.assertAll();
	}

}
