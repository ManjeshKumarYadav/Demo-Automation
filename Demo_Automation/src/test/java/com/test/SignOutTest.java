package com.test;

import org.testng.annotations.Test;

import com.page.SignOutPage;

public class SignOutTest {

	@Test(alwaysRun = true)
	public static void signOutTest() throws Exception {

		SignOutPage.signOut();

	}

}
