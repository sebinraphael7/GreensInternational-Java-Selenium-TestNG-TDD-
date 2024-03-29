package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.homePage;
import pageObjects.signPage;
import pageObjects.signPageWithPassword;
import pageObjects.toastPage;
import testBase.BaseClass;

public class TC_003_Email_Sign_In_Valid extends BaseClass{
	
	@Test
	public void verify_Email_Login_Valid() throws Throwable
	{
		homePage hp=new homePage(driver);
		hp.clickSignIn();
		signPage sip=new signPage(driver);
		sip.clickUseEmailAddress();
		signPageWithPassword spwp=new signPageWithPassword(driver);
		spwp.setEmail("testerrllp1@gmail.com");
		spwp.setPassword("Tester123#");
		spwp.clickSigninBtn();
		toastPage tp=new toastPage(driver);
		Thread.sleep(2000);
		String st = tp.getToastMsg();
		System.out.println(st);
		String st2="Logged in successfully!";
//		String st2="proj";
		SoftAssert s=new SoftAssert();
		s.assertEquals(st,st2);
		s.assertAll();
	}

}
