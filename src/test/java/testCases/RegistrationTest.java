package testCases;


import org.testng.annotations.Test;

import base.Base;
import pageObjects.PageObjectsReg;

public class RegistrationTest extends Base {
	
	PageObjectsReg regObj = new PageObjectsReg(driver);

	@Test
	public void regTest()  {

		

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
		//regObj.waitForElementVisibleAgain(null);
		//regObj.continueButtonAfterReg();
		

	}

	@Test
	public void verifyShortPass() {

		

		regObj.registerClick();
		regObj.pickMalaGender();
		regObj.putFirstName("marjan");
		regObj.putLastName("koneski");
		regObj.putDayinBirthDate("14");
		regObj.putMonthinBirthDate();
		regObj.putYearinBirthDate("1990");
		regObj.putEmail("marjan.koneski@hotmail.com");
		regObj.putCompanyName("Random shit");
		regObj.checkBoxNewsLetter();
		regObj.putPasswordFiled("123");
		regObj.putConfirmPassword("123");
		regObj.clickRegisterButton();
		regObj.verifyShortPass();
		
		//boolean isShortPassDisplayed = regObj.verifyShortPass();
	    //Assert.assertTrue(isShortPassDisplayed, "Error message for short password is not displayed.");

	}
	
	@Test
	public void verifySamePass () {
		
		

		regObj.registerClick();
		regObj.pickMalaGender();
		regObj.putFirstName("marjan");
		regObj.putLastName("koneski");
		regObj.putDayinBirthDate("14");
		regObj.putMonthinBirthDate();
		regObj.putYearinBirthDate("1990");
		regObj.putEmail("marjan.koneski@hotmail.com");
		regObj.putCompanyName("Random shit");
		regObj.checkBoxNewsLetter();
		regObj.putPasswordFiled("12345678");
		regObj.putConfirmPassword("123");
		regObj.clickRegisterButton();
		regObj.verifyBothPassAreSame();
		
	}
	
	
	@Test
	public void verifyFistNameIsMust () {
		
		regObj.registerClick();
		regObj.pickMalaGender();
		regObj.putFirstName("");
		regObj.putLastName("koneski");
		regObj.putDayinBirthDate("14");
		regObj.putMonthinBirthDate();
		regObj.putYearinBirthDate("1990");
		regObj.putEmail("marjan.koneski@hotmail.com");
		regObj.putCompanyName("Random shit");
		regObj.checkBoxNewsLetter();
		regObj.putPasswordFiled("12345678");
		regObj.putConfirmPassword("12345678");
		regObj.clickRegisterButton();
		regObj.verifyFirstName();
		
	}
	
	
	@Test
	public void verifyLastNameIsMust () {
		
		regObj.registerClick();
		regObj.pickMalaGender();
		regObj.putFirstName("marjan");
		regObj.putLastName("");
		regObj.putDayinBirthDate("14");
		regObj.putMonthinBirthDate();
		regObj.putYearinBirthDate("1990");
		regObj.putEmail("marjan.Koneski@hotmail.com");
		regObj.putCompanyName("Random shit");
		regObj.checkBoxNewsLetter();
		regObj.putPasswordFiled("12345678");
		regObj.putConfirmPassword("12345678");
		regObj.clickRegisterButton();		
		regObj.verifyLastName();
		
		
	}
	
	
	@Test
	public void verifyRightEmailFormat ()  {
		
		regObj.registerClick();
		regObj.pickMalaGender();
		regObj.putFirstName("marjan");
		regObj.putLastName("Koneski");
		regObj.putDayinBirthDate("14");
		regObj.putMonthinBirthDate();
		regObj.putYearinBirthDate("1990");
		regObj.putEmail("marjan.Koneski");
		regObj.putCompanyName("Random shit");
		regObj.checkBoxNewsLetter();
		regObj.putPasswordFiled("12345678");
		regObj.putConfirmPassword("12345678");
		regObj.clickRegisterButton();		
		regObj.verifyEmailFormat();
		
		
	}
	
	
	@Test
	public void verifyEmailisRequred () {
		
		regObj.registerClick();
		regObj.pickMalaGender();
		regObj.putFirstName("marjan");
		regObj.putLastName("Koneski");
		regObj.putDayinBirthDate("14");
		regObj.putMonthinBirthDate();
		regObj.putYearinBirthDate("1990");
		regObj.putEmail("");
		regObj.putCompanyName("Random shit");
		regObj.checkBoxNewsLetter();
		regObj.putPasswordFiled("12345678");
		regObj.putConfirmPassword("12345678");
		regObj.clickRegisterButton();		
		regObj.verifyEmailIsRequred();
		
	}

}
