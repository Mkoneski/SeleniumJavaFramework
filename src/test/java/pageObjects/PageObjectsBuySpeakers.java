package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObjectsBuySpeakers {
	
	WebDriver driver;
	WebDriverWait wait;
	Actions actions;
	
	
	public PageObjectsBuySpeakers(WebDriver driver) {
		this.driver = driver;		
		this.actions = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}
	
	By electronicHover = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
	
	By electornicOther = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Others']");
	
	By desiredSpeakers = By.xpath("//h2[@class='product-title']//a[contains(text(),'Beats Pill 2.0 Wireless Speaker')]");
	
	By quantity = By.xpath("//*[@id=\"product_enteredQuantity_21\"]");
	
	By addToChartButton = By.xpath("//*[@id=\"add-to-cart-button-21\"]");
	
	By shopingCartSp = By.xpath("//span[@class='cart-label']");
	
	By goToCart = By.xpath("//*[@id=\"flyout-cart\"]/div/div[4]/button");
	
	public void waitForSecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	/*
	public void hoverOverElement(By locator) {
		WebElement element = driver.findElement(electronicHover);
		actions.moveToElement(element).perform();
		WebElement others = driver.findElement(By.xpath("electornicOther"));
		actions.moveToElement(others);
		actions.click().build().perform();
	}
	*/
	
	/*
	public void hoverOverElementAndClick(By locator) {
	    WebElement element = driver.findElement(locator);
	    actions.moveToElement(element).perform();

	    WebElement others = driver.findElement(electornicOther);
	    actions.moveToElement(others).click().perform();
	}
	 */

	
	public void selectFromMenu () {
		WebElement menuOption = driver.findElement(electronicHover);
		actions.moveToElement(menuOption).perform();
		
		WebElement subMenuOption = driver.findElement(electornicOther); 
		actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
	}
	
	public void clickDesiredSpeakers () {
		driver.findElement(desiredSpeakers).click();
	}
	
	public void desiredQuantity (String quan) {
		driver.findElement(quantity).sendKeys(quan);
	}
	
	public void addToChart () {
		driver.findElement(addToChartButton).click();
	}
	
	public void waitForElementVisibleAgainSpeakers(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(shopingCartSp));
    }
	
	public void clickShopingCart () {
		driver.findElement(shopingCartSp).click();
	}
	
	public void selectFromCart () {
		WebElement cartOption = driver.findElement(shopingCartSp);
		actions.moveToElement(cartOption).perform();
		
		WebElement subCartOption = driver.findElement(goToCart); 
		actions.moveToElement(subCartOption).perform();
		subCartOption.click();
	}


}
