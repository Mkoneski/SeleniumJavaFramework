package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class PageObjectsBuyPc {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	
	public PageObjectsBuyPc(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	//WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
	By computersClick = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
	
	
	By desktopsClick = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");
	
	By desiredPc = By.xpath("//h2[@class='product-title']//a[contains(text(),'Digital Storm VANQUISH 3 Custom Performance PC')]");
	
	By addToCart = By.xpath("//button[@id='add-to-cart-button-2']");
	
	By shopingCart = By.xpath("//span[@class='cart-label']");
	
	By enterCoupon = By.xpath("//input[@id='discountcouponcode']");
	
	By applyCoupon = By.xpath("//button[@id='applydiscountcouponcode']");
	
	By giftCode = By.xpath("//input[@id='giftcardcouponcode']");
	
	By applyGift = By.xpath("//button[@id='applygiftcardcouponcode']");
	
	By agreeTermsAndConditions = By.xpath("//*[@id=\"termsofservice\"]");
	
	By checkOut = By.xpath("//*[@id=\"checkout\"]");
	
	By buildYourPc = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");
	
	By pickProcessor = By.xpath("//*[@id=\"product_attribute_1\"]");
	
	By pickRam = By.xpath("//select[@id='product_attribute_2']");
	
	By pickHDD320 = By.xpath("//label[@for='product_attribute_3_6']");
	
	By pickHDD400 = By.xpath("//label[@for='product_attribute_3_7']");
	
	By pickOSVH = By.xpath("//label[@for='product_attribute_4_8']");
	
	By pickOSVP = By.xpath("//label[@for='product_attribute_4_9']");
	
	By pickMO = By.xpath("//label[@for='product_attribute_5_10']");
	
	By pickAR = By.xpath("//label[@for='product_attribute_5_11']");
	
	By pickTC = By.xpath("//label[@for='product_attribute_5_12']");
	
	By addToCartCustomPc = By.xpath("//button[@id='add-to-cart-button-1']");
	
	By giftWraping = By.xpath("//*[@id=\"checkout_attribute_1\"]");
	
	By goToCartButton = By.xpath("//button[normalize-space()='Go to cart']");
	
	By processorError = By.xpath("//p[@class='content']");
	
	By ramError = By.xpath("//p[@class='content']");
	
	
	
	public void clickComputers () {
		driver.findElement(computersClick).click();
	}
	
	public void clickDesktop () {
		driver.findElement(desktopsClick).click();
	}
	
	public void clickDesiredPc () {
		driver.findElement(desiredPc).click();
	}
	
	public void clickAddToCart () {
		driver.findElement(addToCart).click();
	}
	
	public void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	public void clickShopingCart () {
		driver.findElement(shopingCart).click();
	}
	
	
	
	public void waitForElementVisibleAgain(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(shopingCart));
    }
	
	public void clickBuildCustomPc () {
		driver.findElement(buildYourPc).click();
	}
	
	public void pleaseSelectProcessor () {
		WebElement dropDown = driver.findElement(pickProcessor);
		dropDown.click();
		
		Select select = new Select(dropDown);
	    select.selectByVisibleText("Please select");
		
	}
	
	public void pickProcessor2Gz() {
		   
	    WebElement dropDown = driver.findElement(pickProcessor);
	    dropDown.click();
	    
	    Select select = new Select(dropDown);
	    select.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
	}
	
	public void pickProcessor2_5Gz() {
		   
	    WebElement dropDown = driver.findElement(pickProcessor);
	    dropDown.click();
	    
	    Select select = new Select(dropDown);
	    select.selectByVisibleText("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
	}
	
	public void pickRAM2GB() {
		   
	    WebElement dropDown = driver.findElement(pickRam);
	    dropDown.click();
	    
	    Select select = new Select(dropDown);
	    select.selectByVisibleText("2 GB");
	}
	
	public void pickRAM4GB() {
		   
	    WebElement dropDown = driver.findElement(pickRam);
	    dropDown.click();
	    
	    Select select = new Select(dropDown);
	    select.selectByVisibleText("4 GB");
	}
	
	public void pickRAM8GB() {
		   
	    WebElement dropDown = driver.findElement(pickRam);
	    dropDown.click();
	    
	    Select select = new Select(dropDown);
	    select.selectByVisibleText("8 GB");
	}
	
	public void pickHdd320 () {
		driver.findElement(pickHDD320).click();
	}
	
	public void pickHdd400 () {
		driver.findElement(pickHDD400).click();
	}
	
	public void pickOsVh () {
		driver.findElement(pickOSVH).click();
	}
	
	public void pickOsVp () {
		driver.findElement(pickOSVP).click();
	}
	
	public void pickSoftwareMO () {
		driver.findElement(pickMO).click();
	}
	
	public void pickSoftwareAR () {
		driver.findElement(pickAR).click();
	}
	
	public void pickSoftwareTC () {
		driver.findElement(pickTC).click();
	}
	
	public void addToCartCustomPc () {
		driver.findElement(addToCartCustomPc).click();
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
	
	public void selectFromMenuSp () {
		WebElement menuOption = driver.findElement(shopingCart);
		actions.moveToElement(menuOption).perform();
		
		WebElement subMenuOption = driver.findElement(goToCartButton); 
		actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
	}
	
	public boolean verifyProcessor () {
		WebElement processorError = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p"));
		
		if (processorError.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void waitForErrorElementVisibleAgain(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(processorError));
    }
	
	public boolean verifyRam () {
		WebElement ramError = driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p"));
		
		if (ramError.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}

}
