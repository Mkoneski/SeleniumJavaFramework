package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsLog {
	
	WebDriver driver;

	public PageObjectsLog(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By loginButton = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	
	By loginEmail = By.xpath("//*[@id=\"Email\"]");
	
	By loginPassword = By.xpath("//*[@id=\"Password\"]");
	
	By loginRememberMeButton = By.xpath("//*[@id=\"RememberMe\"]");
	
	By loginFinishLoginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
	
	public void loginClick () {
		driver.findElement(loginButton).click();
	}
	
	public void loginEmailField (String emailText) {
		driver.findElement(loginEmail).sendKeys(emailText);
	}
	
	public void loginPasswordField (String passwordText) {
		driver.findElement(loginPassword).sendKeys(passwordText);
	}
	
	public void loginClickRememberButton () {
		driver.findElement(loginRememberMeButton).click();
	}
	
	public void loginFinishButton () {
		driver.findElement(loginFinishLoginButton).click();
	}
	
	public boolean verifyEmptyEmail () {
		WebElement emptyEmail = driver.findElement(By.xpath("//*[@id=\"Email-error\"]"));
		
		if(emptyEmail.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyPassword () {
		WebElement emptyPassword = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
		
		if (emptyPassword.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyLoginWithInvalidEmail() {
		WebElement wrongEmail = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
		
		if(wrongEmail.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyLoginWithInvalidPassword () {
		WebElement wrongPassword = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
		
		if (wrongPassword.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyLoginUnsucessfull () {
		WebElement wrongLogin = driver.findElement(By.xpath("//li[normalize-space()='No customer account found']"));
		
		if (wrongLogin.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}

}






