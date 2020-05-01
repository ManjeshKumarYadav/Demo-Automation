package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends SetupPage {

	public static final String SIGN_IN_LINK_TEXT = "Sign in";
	public static final String EMAIL_ID = "email";
	public static final String PASSWORD_ID = "passwd";
	public static final String SIGN_IN_ID = "SubmitLogin";
	
	public static void navigateToSignInPage() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(SIGN_IN_LINK_TEXT)));
		driver.findElement(By.linkText(SIGN_IN_LINK_TEXT)).click();
	}

	public static void enterCredentials(String username, String password) throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(EMAIL_ID)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PASSWORD_ID)));

		driver.findElement(By.id(EMAIL_ID)).sendKeys(username);
		driver.findElement(By.id(PASSWORD_ID)).sendKeys(password);

	}

	public static void clickOnSignIn() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(SIGN_IN_ID)));
		driver.findElement(By.id(SIGN_IN_ID)).click();

	}

}
