package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.LoginPage;

public class LoginTest {

	@Test(alwaysRun = true)
	@Parameters({ "username", "password" })
	public static void loginTest(String username, String password) throws Exception {

		LoginPage.navigateToSignInPage();
		LoginPage.enterCredentials(username, password);
		LoginPage.clickOnSignIn();

	}

}
