package testCases;

import org.testng.annotations.Test;

import base.Base;
import pageObjects.PageObjectsLog;

public class LoginTest extends Base {
	
	PageObjectsLog logObj = new PageObjectsLog (driver);
	
	
	@Test
	public void loginTest () {
		
		
		
		logObj.loginClick();
		logObj.loginEmailField("marjan.koneski@hotmail.com");
		logObj.loginPasswordField("12345678");
		logObj.loginClickRememberButton();
		logObj.loginFinishButton();
		
	}
	
	@Test
	public void loginWithEmptyEmailFieldTest () {
		
		logObj.loginClick();
		logObj.loginEmailField("");
		logObj.loginPasswordField("12345678");
		logObj.loginClickRememberButton();
		logObj.loginFinishButton();
		logObj.verifyEmptyEmail();
		
	}
	
	@Test
	public void loginWithEmptyPassFieldTest () {
		
		logObj.loginClick();
		logObj.loginEmailField("marjan.koneski@hotmail.com");
		logObj.loginPasswordField("");
		logObj.loginClickRememberButton();
		logObj.loginFinishButton();
		logObj.verifyPassword();
	}
	
	@Test
	public void loginWithWrongPasswordTest () {
		
		logObj.loginClick();
		logObj.loginEmailField("marjan.koneski@hotmail.com");
		logObj.loginPasswordField("123478");
		logObj.loginClickRememberButton();
		logObj.loginFinishButton();
		logObj.verifyLoginWithInvalidPassword();
		
	}
	
	@Test
	public void loginWithWrongEmailTest () {
		
		logObj.loginClick();
		logObj.loginEmailField("koneski@hotmail.com");
		logObj.loginPasswordField("12345678");
		logObj.loginClickRememberButton();
		logObj.loginFinishButton();
		logObj.verifyLoginWithInvalidEmail();
		
	}
	
	@Test
	public void verifyloginWithNonExistentUserTest() {

		logObj.loginClick();
		logObj.loginEmailField("marjan@hotmail.com");
		logObj.loginPasswordField("12345678");
		logObj.loginClickRememberButton();
		logObj.loginFinishButton();
		logObj.verifyLoginUnsucessfull();

	}

}
