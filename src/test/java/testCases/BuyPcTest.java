package testCases;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.PageObjectsBuyPc;
import pageObjects.PageObjectsChekout;
import pageObjects.PageObjectsLog;
import pageObjects.PageObjectsReg;

public class BuyPcTest extends Base {
	
	PageObjectsBuyPc pcObj = new PageObjectsBuyPc(driver);
	PageObjectsReg regOb = new PageObjectsReg (driver);
	PageObjectsLog logOb = new PageObjectsLog(driver);
	PageObjectsChekout checkoutOb = new PageObjectsChekout(driver);
	
	
	@Test
	public void buyfirstPcTestWithReg () {
		
		regOb.registerClick();
		regOb.pickMalaGender();
		regOb.putFirstName("marjan");
		regOb.putLastName("koneski");
		regOb.putDayinBirthDate("14");
		regOb.putMonthinBirthDateWithDropDown();		
		regOb.putYearinBirthDate("1990");
		regOb.putEmail("marjan.koneski@hotmail.com");
		regOb.putCompanyName("Random shit");
		regOb.checkBoxNewsLetter();
		regOb.putPasswordFiled("12345678");
		regOb.putConfirmPassword("12345678");
		regOb.clickRegisterButton();
		
		pcObj.clickComputers();
		pcObj.clickDesktop();
		pcObj.clickDesiredPc();
		pcObj.clickAddToCart();
		//pcObj.waitForSeconds(6);
		pcObj.waitForElementVisibleAgain(null);
		pcObj.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterGiftField("random shit");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("shit");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickTermsAndContidions();		
		checkoutOb.clickChekout();
		
		
	}
	
	@Test
	public void buyfirstPcTestWithLog () {
		
		logOb.loginClick();
		logOb.loginEmailField("marjan.koneski@hotmail.com");
		logOb.loginPasswordField("12345678");
		logOb.loginClickRememberButton();
		logOb.loginFinishButton();		
		pcObj.clickComputers();
		pcObj.clickDesktop();
		pcObj.clickDesiredPc();
		pcObj.clickAddToCart();
		//pcObj.waitForSeconds(6);
		pcObj.waitForElementVisibleAgain(null);
		pcObj.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterCouponField("random shit");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("shit");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickTermsAndContidions();		
		checkoutOb.clickChekout();
		
		
	}
	
	@Test
	public void buyCustomPcWithReg() {
		
		regOb.registerClick();
		regOb.pickMalaGender();
		regOb.putFirstName("marjan");
		regOb.putLastName("koneski");
		regOb.putDayinBirthDate("14");
		regOb.putMonthinBirthDateWithDropDown();		
		regOb.putYearinBirthDate("1990");
		regOb.putEmail("marjan.koneski@hotmail.com");
		regOb.putCompanyName("Random shit");
		regOb.checkBoxNewsLetter();
		regOb.putPasswordFiled("12345678");
		regOb.putConfirmPassword("12345678");
		regOb.clickRegisterButton();
		
		pcObj.clickComputers();
		pcObj.clickDesktop();
		pcObj.clickBuildCustomPc();
		pcObj.pickProcessor2Gz();
		pcObj.pickHdd320();
		pcObj.pickOsVh();
		pcObj.pickRAM2GB();
		pcObj.pickSoftwareMO();
		pcObj.addToCartCustomPc();
		pcObj.waitForElementVisibleAgain(null);
		pcObj.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterCouponField("fadsa");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("dsad");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickTermsAndContidions();
		checkoutOb.clickChekout();
		
	}
	
	@Test
	public void buyCustomPcWithLog() {
		
		logOb.loginClick();
		logOb.loginEmailField("marjan.koneski@hotmail.com");
		logOb.loginPasswordField("12345678");
		logOb.loginClickRememberButton();
		logOb.loginFinishButton();
		
		pcObj.clickComputers();
		pcObj.clickDesktop();
		pcObj.clickBuildCustomPc();
		pcObj.pickProcessor2Gz();
		pcObj.pickHdd320();
		pcObj.pickOsVh();
		pcObj.pickRAM2GB();
		pcObj.pickSoftwareMO();
		pcObj.addToCartCustomPc();
		pcObj.waitForElementVisibleAgain(null);
		pcObj.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterCouponField("fadsa");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("dsad");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickTermsAndContidions();
		checkoutOb.clickChekout();
		
	}
	
	@Test
	public void buyCustomPcAndVerifyProcessor() {
		
		pcObj.clickComputers();
		pcObj.clickDesktop();
		pcObj.clickBuildCustomPc();
		pcObj.pleaseSelectProcessor();
		pcObj.pickHdd320();
		pcObj.pickOsVh();
		pcObj.pickRAM2GB();
		pcObj.pickSoftwareMO();
		pcObj.addToCartCustomPc();
		//pcObj.waitForSeconds(1);
		pcObj.waitForErrorElementVisibleAgain(null);
		pcObj.verifyProcessor();
		
		
		
		
	}
	
	@Test
	public void buyCustomPcAndVerifyRam() {
		
		pcObj.clickComputers();
		pcObj.clickDesktop();
		pcObj.clickBuildCustomPc();
		pcObj.pickProcessor2_5Gz();
		pcObj.pickHdd320();
		pcObj.pickOsVh();		
		pcObj.pickSoftwareMO();
		pcObj.addToCartCustomPc();
		pcObj.waitForErrorElementVisibleAgain(null);
		pcObj.verifyRam();
		
		
		
		
	}

	

}
