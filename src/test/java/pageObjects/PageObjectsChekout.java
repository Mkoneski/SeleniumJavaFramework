package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObjectsChekout {
	
	WebDriver driver;
			
	public PageObjectsChekout(WebDriver driver) {
		this.driver = driver;
	}

	By enterCoupon = By.xpath("//input[@id='discountcouponcode']");
	
	By applyCoupon = By.xpath("//button[@id='applydiscountcouponcode']");
	
	By giftCode = By.xpath("//input[@id='giftcardcouponcode']");
	
	By applyGift = By.xpath("//button[@id='applygiftcardcouponcode']");
	
	By agreeTermsAndConditions = By.xpath("//*[@id=\"termsofservice\"]");
	
	By checkOut = By.xpath("//*[@id=\"checkout\"]");
	
	By giftWraping = By.xpath("//*[@id=\"checkout_attribute_1\"]");
	
	By updateShopingCart = By.xpath("//button[@id='updatecart']");
	
	By continueShoping = By.xpath("//button[@name='continueshopping']");
	
	By estimateShiping = By.xpath("//a[@id='open-estimate-shipping-popup']");
	
	By removeFromShopingCart = By.xpath("//button[@class='remove-btn']");
	
	By addQtyFromShopingCart = By.xpath("//input[@id='itemquantity11225']");
	
	By emptyShopingCart = By.xpath("//div[@class='no-data']");
	
	
	
	
	public boolean verifyEmptyShopingCart () {
		WebElement emptyCart = driver.findElement(By.xpath("//div[@class='no-data']"));
		
		if(emptyCart.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void clearTheFiled () {
		WebElement inputField = driver.findElement(addQtyFromShopingCart);
		
		inputField.sendKeys(Keys.BACK_SPACE);
	}
	
	public void clickRemoveFromShopingCart () {
		driver.findElement(removeFromShopingCart).click();
	}
	
	public void clickEstimatePopUp () {
		driver.findElement(estimateShiping).click();
	}
	
	public void clickContinueShoping () {
		driver.findElement(continueShoping).click();
	}
	
	public void clickUpdateShoping () {
		driver.findElement(updateShopingCart).click();
	}
	
	public void pickGiftWrapingYes() {
		   
	    WebElement dropDown = driver.findElement(giftWraping);
	    dropDown.click();
	    
	    Select select = new Select(dropDown);
	    select.selectByVisibleText("Yes [+$10.00]");
	}
	
	public void pickGiftWrapingNo() {
		   
	    WebElement dropDown = driver.findElement(giftWraping);
	    dropDown.click();
	    
	    Select select = new Select(dropDown);
	    select.selectByVisibleText("Yes [+$10.00]");
	}
	
	public void enterCouponField (String couponText) {
		driver.findElement(enterCoupon).sendKeys(couponText);
	}
	
	public void enterGiftField (String giftText) {
		driver.findElement(giftCode).sendKeys(giftText);
	}
	
	public void clickApplyCoupon() {
		driver.findElement(applyCoupon).click();
	}
	
	public void clickAddGiftCode () {
		driver.findElement(applyGift).click();
	}
	
	public void clickTermsAndContidions () {
		driver.findElement(agreeTermsAndConditions).click();
	}
	
	public void clickChekout () {
		driver.findElement(checkOut).click();
	}
	
	public void alertPopUp () {
		
		Alert alert = driver.switchTo().alert();
		String popUpText = alert.getText();
		System.out.println("Pop-up test: " + popUpText);
		
		alert.accept();
		
	}
	
	public boolean popUp () {
		WebElement errorTerms = driver.findElement(By.xpath("//p[contains(text(),'Please accept the terms of service before the next')]"));
		
		if(errorTerms.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}

}
