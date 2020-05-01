package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignOutPage extends SetupPage {

	public static final String SIGN_OUT_LINK_TEXT = "Sign out";
	public static final String WOMEN_LINK_TEXT = "Women";
	public static final String DRESSES_LINK_TEXT = "Dresses";
	public static final String TSHIRT_LINK_TEXT = "T-shirts";

	public static void signOut() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(SIGN_OUT_LINK_TEXT)));
		driver.findElement(By.linkText(SIGN_OUT_LINK_TEXT)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(WOMEN_LINK_TEXT)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(DRESSES_LINK_TEXT)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(TSHIRT_LINK_TEXT)));
	}

}
