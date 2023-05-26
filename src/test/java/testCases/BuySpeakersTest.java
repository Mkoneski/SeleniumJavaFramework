package testCases;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.PageObjectsBuyPc;
import pageObjects.PageObjectsBuySpeakers;
import pageObjects.PageObjectsChekout;
import pageObjects.PageObjectsLog;
import pageObjects.PageObjectsReg;

public class BuySpeakersTest extends Base {
	
	PageObjectsBuySpeakers spObj = new PageObjectsBuySpeakers(driver);
	PageObjectsBuyPc pjb = new PageObjectsBuyPc(driver);
	PageObjectsChekout checkoutOb = new PageObjectsChekout(driver);
	PageObjectsReg regObj = new PageObjectsReg(driver);
	PageObjectsLog logObj = new PageObjectsLog (driver);
	
	
	@Test
	public void speakersTestWithLogin () {
		
		logObj.loginClick();
		logObj.loginEmailField("marjan.koneski@hotmail.com");
		logObj.loginPasswordField("12345678");
		logObj.loginClickRememberButton();
		logObj.loginFinishButton();
		spObj.selectFromMenu();	
		spObj.clickDesiredSpeakers();
		spObj.desiredQuantity("3");
		spObj.addToChart();
		pjb.waitForElementVisibleAgain(null);
		//spObj.waitForElementVisibleAgainSpeakers(null);
		spObj.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterGiftField("random shit");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("shit");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickTermsAndContidions();		
		checkoutOb.clickChekout();
		
		
		
	}
	
	@Test
	public void speakersTestWithLoginWithRegistation () {
		
		regObj.registerClick();
		regObj.pickMalaGender();
		regObj.putFirstName("marjan");
		regObj.putLastName("koneski");
		regObj.putDayinBirthDate("14");
		regObj.putMonthinBirthDateWithDropDown();		
		regObj.putYearinBirthDate("1990");
		regObj.putEmail("marjan.koneski@hotmail.com");
		regObj.putCompanyName("Random shit");
		regObj.checkBoxNewsLetter();
		regObj.putPasswordFiled("12345678");
		regObj.putConfirmPassword("12345678");
		regObj.clickRegisterButton();
		spObj.selectFromMenu();	
		spObj.clickDesiredSpeakers();
		spObj.desiredQuantity("3");
		spObj.addToChart();
		pjb.waitForElementVisibleAgain(null);
		//spObj.waitForElementVisibleAgainSpeakers(null);
		spObj.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterGiftField("random shit");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("shit");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickTermsAndContidions();		
		checkoutOb.clickChekout();
		
		
		
	}
	
	@Test
	public void speakersTestButWithHover () {
		
		spObj.selectFromMenu();	
		spObj.clickDesiredSpeakers();
		spObj.desiredQuantity("3");
		spObj.addToChart();
		pjb.waitForElementVisibleAgain(null);
		//spObj.selectFromCart();
		
		//pjb.selectFromMenuSp();
	}

}
