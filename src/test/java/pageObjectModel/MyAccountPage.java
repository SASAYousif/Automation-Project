package pageObjectModel;


import utilities.Assertion;
import org.openqa.selenium.By;

import utilities.ElementAction;

public class MyAccountPage extends ElementAction {
	Assertion assertions = new Assertion();
	//=============================Locators==================================
    By myAccountTitle = By.cssSelector(".page-heading");
    //=============================Strings==================================
    String myAccountTitleText = "MY ACCOUNT";
    //===================================Actions===================================
    //-----------------------------------Assertions--------------------------------
    
    //------------------------------Text Assertions----------------------------------
    public void assertMyAccountTitle()
    {
    	assertions.assertElementText(myAccountTitle, myAccountTitleText);
    }
}