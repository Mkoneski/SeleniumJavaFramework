package testCases;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.PageObjectsBuyPc;
import pageObjects.PageObjectsBuySpeakers;
import pageObjects.PageObjectsChekout;
import pageObjects.PageObjectsLog;
import pageObjects.PageObjectsReg;

public class CheckoutPageTests extends Base {
	
	PageObjectsBuySpeakers spObj = new PageObjectsBuySpeakers(driver);
	PageObjectsBuyPc pjb = new PageObjectsBuyPc(driver);
	PageObjectsChekout checkoutOb = new PageObjectsChekout(driver);
	PageObjectsReg regObj = new PageObjectsReg(driver);
	PageObjectsLog logObj = new PageObjectsLog (driver);
	
	
	@Test
	public void removeItemTest () {
		
		pjb.clickComputers();
		pjb.clickDesktop();
		pjb.clickDesiredPc();
		pjb.clickAddToCart();
		//pcObj.waitForSeconds(6);
		pjb.waitForElementVisibleAgain(null);
		pjb.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterGiftField("random shit");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("shit");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickTermsAndContidions();		
		checkoutOb.clickRemoveFromShopingCart();
		checkoutOb.verifyEmptyShopingCart();
		
		
	}
	
	
	@Test
	public void continueShopingTest () {
		
		pjb.clickComputers();
		pjb.clickDesktop();
		pjb.clickDesiredPc();
		pjb.clickAddToCart();
		//pjb.waitForSeconds(3);
		pjb.waitForElementVisibleAgain(null);
		pjb.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterGiftField("random shit");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("shit");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickContinueShoping();
		pjb.clickComputers();
		pjb.clickDesktop();
		pjb.clickDesiredPc();
		pjb.clickAddToCart();
		pjb.waitForElementVisibleAgain(null);
		pjb.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterGiftField("random shit");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("shit");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickTermsAndContidions();
		checkoutOb.clickChekout();
	}
	
	@Test
	public void verifyNoTermsAndConditios () {
		
		pjb.clickComputers();
		pjb.clickDesktop();
		pjb.clickDesiredPc();
		pjb.clickAddToCart();
		//pjb.waitForSeconds(3);
		pjb.waitForElementVisibleAgain(null);
		pjb.clickShopingCart();
		checkoutOb.pickGiftWrapingYes();
		checkoutOb.enterGiftField("random shit");
		checkoutOb.clickApplyCoupon();
		checkoutOb.enterGiftField("shit");
		checkoutOb.clickAddGiftCode();
		checkoutOb.clickChekout();
		checkoutOb.popUp();
		
	}
	
	@Test
	public void updateShoping () {
		
		pjb.clickComputers();
		pjb.clickDesktop();
		pjb.clickDesiredPc();
		pjb.clickAddToCart();
		pjb.waitForElementVisibleAgain(null);
		pjb.clickShopingCart();	
		
		checkoutOb.clickUpdateShoping();
		checkoutOb.clickTermsAndContidions();
		checkoutOb.clickChekout();
		
	}

}
