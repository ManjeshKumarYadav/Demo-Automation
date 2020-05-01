package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.CreateUserPage;

public class CreateUserTest {

	@Test(alwaysRun = true)
	@Parameters({ "username", "password" })
	public static void createUserTest(String username, String password) throws Exception {

		CreateUserPage.navigateToSignInPage();
		CreateUserPage.validateCreateAccountPage();
		CreateUserPage.createAnAccount(username);
		CreateUserPage.enterPersonalInformation(password);
	
	}

}
