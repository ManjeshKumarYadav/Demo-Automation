package com.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.page.PlaceOrderPage;
import com.page.SetupPage;

public class PlaceOrderTest {

	@Test(alwaysRun = true)
	public static void OrderTest() throws Exception {

		PlaceOrderPage.selectProduct();
		PlaceOrderPage.selectQuantityAndAddToCart();
		PlaceOrderPage.proceedToCheckout();
		PlaceOrderPage.validateOrderHistory();

	}

	@AfterTest(alwaysRun = true)
	public static void closeDriverTest() throws Exception {

		SetupPage.closeDriver();

	}

}
