package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PageObjectsReg {
	
	WebDriver driver;
	WebDriverWait wait;

	public PageObjectsReg(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By register = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	
	By genderMale = By.xpath("//*[@id=\"gender-male\"]");
	
	By genderFemale = By.xpath("//*[@id=\"gender-female\"]");
	
	By firstName = By.xpath("//*[@id=\"FirstName\"]");
	
	By lastName = By.xpath("//*[@id=\"LastName\"]");
	
	By dateOfBirthDay = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
	
	By dateOfBirthMonth = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
	
	By dateOfBirthYear = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
	
	By emailField = By.xpath("//*[@id=\"Email\"]");
	
	By companyName = By.xpath("//*[@id=\"Company\"]");
	
	By newsLetterCheckBox = By.xpath("//*[@id=\"Newsletter\"]");
	
	By passwordField = By.xpath("//*[@id=\"Password\"]");
	
	By passwordConfirm = By.xpath("//*[@id=\"ConfirmPassword\"]");
	
	By registerButton = By.xpath("//*[@id=\"register-button\"]");
	
	By continueButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a");
	
	
	public void registerClick () {
		driver.findElement(register).click();
	}
	
	public void pickMalaGender () {
		driver.findElement(genderMale).click();
	}
	
	public void pickFemaleGender () {
		driver.findElement(genderFemale).click();
	}
	
	public void putFirstName (String firstNameText) {
		driver.findElement(firstName).sendKeys(firstNameText);
	}
	
	public void putLastName (String lastNameText) {
		driver.findElement(lastName).sendKeys(lastNameText);
	}
	
	public void putDayinBirthDate (String day) {
		driver.findElement(dateOfBirthDay).sendKeys(day);
	}
	
	public void putMonthinBirthDate () {
		driver.findElement(dateOfBirthMonth).click();
	}
	
	public void putMonthinBirthDateWithDropDown() {
	   
	    WebElement dropDown = driver.findElement(By.name("DateOfBirthMonth"));
	    dropDown.click();
	    
	    Select select = new Select(dropDown);
	    select.selectByVisibleText("March");
	}

	
	public void putYearinBirthDate (String year) {
		driver.findElement(dateOfBirthYear).sendKeys(year);
	}
	
	public void putEmail (String emailText) {
		driver.findElement(emailField).sendKeys(emailText);
	}
	
	public void putCompanyName (String companyNameText) {
		driver.findElement(companyName).sendKeys(companyNameText);
	}
	
	public void checkBoxNewsLetter () {
		driver.findElement(newsLetterCheckBox).click();
	}
	
	public void putPasswordFiled (String passwordText) {
		driver.findElement(passwordField).sendKeys(passwordText);
	}
	
	public void putConfirmPassword (String confirmPasswordText) {
		driver.findElement(passwordConfirm).sendKeys(confirmPasswordText);
	}
	
	public void clickRegisterButton () {
		driver.findElement(registerButton).click();
	}
	
	public boolean verifyShortPass () {
		WebElement shortPass = driver.findElement(By.xpath("//*[@id=\"Password-error\"]/p"));
		
		if(shortPass.isDisplayed()) {
			return true;
		}
		else
		{
		return false;
		}
				
	}
	
			
	
	public boolean verifyBothPassAreSame () {
		WebElement samePass = driver.findElement(By.xpath("//*[@id=\"ConfirmPassword-error\"]"));
		
		if(samePass.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean verifyFirstName () {
		WebElement firstNameIsMust = driver.findElement(By.xpath("//*[@id=\"FirstName-error\"]"));
		
		if (firstNameIsMust.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyLastName () {
		WebElement lastNameIsMust = driver.findElement(By.xpath("//*[@id=\"LastName-error\"]"));
		
		if (lastNameIsMust.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyEmailFormat () {
		WebElement emailFormat = driver.findElement(By.xpath("//*[@id=\"Email-error\"]"));
		
		if(emailFormat.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean verifyEmailIsRequred () {
		WebElement emailReq = driver.findElement(By.xpath("//*[@id=\"Email-error\"]"));
		
		if (emailReq.isDisplayed()) {
			return true;
		}
		else {
			return false;
		}
	} 
	
	public void continueButtonAfterReg () {
		driver.findElement(continueButton).click();
	}
	
	public void waitForElementVisibleAgain(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
    }

}
