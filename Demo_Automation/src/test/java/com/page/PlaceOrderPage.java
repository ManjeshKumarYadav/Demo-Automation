package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PlaceOrderPage extends SetupPage {

	public static final String WOMEN_LINK_TEXT = "Women";
	public static final String EYE_ICON_CLASS = "quick-view-mobile";
	public static final String CLOSE_ICON_CLASS = "fancybox-item fancybox-close";

	public static final String QUANTITY_ID = "quantity_wanted";
	public static final String ADD_CART_NAME = "Submit";

	public static final String CLOSE_ICON_CSS = "span[class='cross']";
	public static final String CONTINUE_SHOPPING_CLASS = "continue btn btn-default button exclusive-medium";

	public static final String PROCEED_TO_CHECKOUT_LINK_TEXT = "Proceed to checkout";
	public static final String TOTAL_PRICE_CLASS = "ajax_block_cart_total";

	public static final String SUMMARY_CLASS = "step_current  first";
	public static final String TOTAL_PRICE_ID = "total_price";
	public static final String PROCEED_TO_CHECKOUT2_CLASS = "button btn btn-default standard-checkout button-medium";

	public static final String ADDRESS_CLASS = "step_current third";

	public static final String SHIPPING_CLASS = "step_current four";
	public static final String TERMS_AND_SERVICES_ID = "cgv";
	public static final String DELIVERY_OPTION_PRICE_CLASS = "delivery_option_price";
	public static final String PAYMENT_CLASS = "step_current last";
	public static final String BANKWIRE_CSS = "a[class='bankwire']";
	public static final String CHEQUE_CSS = "a[class='cheque']";
	public static final String CONFIRM_MY_ORDER_CLASS = "button btn btn-default button-medium";
	public static final String PRICE_CLASS = "price";

	public static final String ACCOUNT_CLASS = "account";
	public static final String ORDER_HISTORY_LINK_TEXT = "Order history and details";
	public static final String MY_CREDIT_LINK_TEXT = "My credit slips";
	public static final String MY_ADDRESS_LINK_TEXT = "My addresses";
	public static final String MY_INFORMATION_LINK_TEXT = "My personal information";
	public static final String MY_WISHLISTS_LINK_TEXT = "My wishlists";
	public static final String ORDER_HISTORY_CLASS = "navigation_page";
	public static final String PRICE_CSS = "span[class='price']";
	
	public static String totalPrice=null;

	public static void selectProduct() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(WOMEN_LINK_TEXT)));
		driver.findElement(By.linkText(WOMEN_LINK_TEXT)).click();

		Thread.sleep(5000);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector("img[class='replace-2x img-responsive']")));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				driver.findElements(By.cssSelector("img[class='replace-2x img-responsive']")).get(1));

		Actions action = new Actions(driver);
		WebElement we = driver.findElements(By.cssSelector("img[class='replace-2x img-responsive']")).get(1);
		action.moveToElement(we).build().perform();

		driver.findElements(By.linkText("Quick view")).get(0).click();
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.className("fancybox-iframe")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(QUANTITY_ID)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(ADD_CART_NAME)));

	}

	public static void selectQuantityAndAddToCart() throws Exception {

		driver.findElement(By.id(QUANTITY_ID)).clear();
		driver.findElement(By.id(QUANTITY_ID)).sendKeys("2");
		driver.findElement(By.name(ADD_CART_NAME)).click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(PROCEED_TO_CHECKOUT_LINK_TEXT)));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='ajax_block_cart_total']")));

		System.out.println("Total Price: "
				+ driver.findElement(By.cssSelector("span[class='ajax_block_cart_total']")).getText().trim());

	}

	public static void proceedToCheckout() throws Exception {

		driver.findElement(By.linkText(PROCEED_TO_CHECKOUT_LINK_TEXT)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='step_current  first']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(TOTAL_PRICE_ID)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(PROCEED_TO_CHECKOUT_LINK_TEXT)));

		System.out.println("Total Price: " + driver.findElement(By.id(TOTAL_PRICE_ID)).getText().trim());

		driver.findElement(By.linkText(PROCEED_TO_CHECKOUT_LINK_TEXT)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='step_current third']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("processAddress")));
		driver.findElement(By.name("processAddress")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='step_current four']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(TERMS_AND_SERVICES_ID)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("processCarrier")));

		driver.findElement(By.id(TERMS_AND_SERVICES_ID)).click();
		driver.findElement(By.name("processCarrier")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='step_current last']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Pay by bank wire")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Pay by check")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(TOTAL_PRICE_ID)));

		System.out.println("Total Price: " + driver.findElement(By.id(TOTAL_PRICE_ID)).getText().trim());
		driver.findElement(By.partialLinkText("Pay by check")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("button[class='button btn btn-default button-medium']")));

		driver.findElement(By.cssSelector("button[class='button btn btn-default button-medium']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class='alert alert-success']")));
		System.out.println("Total Price: "
				+ driver.findElement(By.cssSelector("p[class='alert alert-success']")).getText().trim());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='price']")));
		
		
		totalPrice=driver.findElement(By.cssSelector("span[class='price']")).getText().trim();
		
		System.out
		.println("Total Price: " + totalPrice);

	}

	public static void validateOrderHistory() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(ACCOUNT_CLASS)));

		driver.findElement(By.className(ACCOUNT_CLASS)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Orders']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Credit slips']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Addresses']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Information']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='My wishlists']")));

		driver.findElement(By.cssSelector("a[title='Orders']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(PRICE_CSS)));
		System.out.println("Total Price: " + driver.findElement(By.cssSelector(PRICE_CSS)).getText().trim());
		
		Assert.assertEquals(driver.findElement(By.cssSelector(PRICE_CSS)).getText().trim(),totalPrice);

	}

}
