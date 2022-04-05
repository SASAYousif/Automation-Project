 package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import pageObjectModel.LoginPage;
import utilities.Screenshots;


@Listeners({ExtentITestListenerClassAdapter.class})
public class LoginTest extends pageObjectModel.LoginPage {
	pageObjectModel.HomePage homePage = new pageObjectModel.HomePage();
	pageObjectModel.MyAccountPage myAccountPage = new pageObjectModel.MyAccountPage();
	Screenshots screenshots = new Screenshots();
	//=======================================================
	@Test
	public void login()
	{
		try {
			homePage.openAutomationPractice();
			homePage.clickSignIn();
			typeEmail("test@test.com");
			typePassword("123456");
			clickSubmit();
			myAccountPage.assertMyAccountTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	@AfterMethod
	public void tackeScreenShot()
	{ 
		screenshots.captureScreenShot("testScreenshot");
	}
}