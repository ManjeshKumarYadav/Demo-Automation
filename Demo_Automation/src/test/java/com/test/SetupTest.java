package com.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.page.SetupPage;

public class SetupTest {

	@Test(alwaysRun = true)
	@Parameters("appUrl")
	public static void setUp(String appUrl) throws Exception {

		SetupPage.setUp(appUrl);

	}


}
