package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateUserPage extends SetupPage {

	public static final String SIGN_IN_LINK_TEXT = "Sign in";
	public static final String EMAIL_ADDRESS_ID = "email_create";
	public static final String CREATE_AN_ACCOUNT_ID = "SubmitCreate";

	public static final String GENDER_MALE_ID = "id_gender1";
	public static final String GENDER_FEMALE_ID = "id_gender2";

	public static final String CUTOMER_FIRSTNAME_ID = "customer_firstname";
	public static final String CUTOMER_LASTNAME_ID = "customer_lastname";

	public static final String EMAIL_ID = "email";
	public static final String PASSWORD_ID = "passwd";

	public static final String DAYS_ID = "uniform-days";
	public static final String MONTHS_ID = "uniform-months";
	public static final String YEARS_ID = "uniform-years";

	public static final String FIRSTNAME_ID = "firstname";
	public static final String LASTNAME_ID = "lastname";
	public static final String COMPANY_ID = "company";
	public static final String ADDRESS_LINE_1_ID = "address1";
	public static final String ADDRESS_LINE_2_ID = "address2";
	public static final String CITY_ID = "city";
	public static final String STATE_ID = "uniform-id_state";
	public static final String POSTCODE_IS = "postcode";
	public static final String COUNTRY_ID = "uniform-id_country";
	public static final String ADDITIONAL_INFORMATION_ID = "other";

	public static final String PHONE_ID = "phone";
	public static final String MOBILE_ID = "phone_mobile";
	public static final String ALIAS_ID = "alias";
	public static final String CREATE_ID = "submitAccount";

	public static void navigateToSignInPage() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(SIGN_IN_LINK_TEXT)));
		driver.findElement(By.linkText(SIGN_IN_LINK_TEXT)).click();
	}

	public static void validateCreateAccountPage() throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(EMAIL_ADDRESS_ID)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CREATE_AN_ACCOUNT_ID)));

	}

	public static void createAnAccount(String username) throws Exception {

		driver.findElement(By.id(EMAIL_ADDRESS_ID)).sendKeys(username);
		driver.findElement(By.id(CREATE_AN_ACCOUNT_ID)).click();

	}

	public static void enterPersonalInformation(String password) throws Exception {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(GENDER_MALE_ID)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(GENDER_FEMALE_ID)));

		driver.findElement(By.id(GENDER_MALE_ID)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CUTOMER_FIRSTNAME_ID)));
		driver.findElement(By.id(CUTOMER_FIRSTNAME_ID)).sendKeys("Manjesh");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CUTOMER_LASTNAME_ID)));
		driver.findElement(By.id(CUTOMER_LASTNAME_ID)).sendKeys("Yadav");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(EMAIL_ID)));
		// driver.findElement(By.id(EMAIL_ID)).sendKeys("manjesh1.yadav1@shopping.com");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PASSWORD_ID)));
		driver.findElement(By.id(PASSWORD_ID)).sendKeys(password);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(DAYS_ID)));

		driver.findElement(By.id(DAYS_ID)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value='27']")));

		driver.findElement(By.cssSelector("option[value='27']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(MONTHS_ID)));

		driver.findElement(By.id(MONTHS_ID)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"months\"]/option[2]")));

		driver.findElement(By.xpath("//*[@id=\"months\"]/option[2]")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(YEARS_ID)));

		driver.findElement(By.id(YEARS_ID)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value='1993']")));

		driver.findElement(By.cssSelector("option[value='1993']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(FIRSTNAME_ID)));
		// driver.findElement(By.id(FIRSTNAME_ID)).sendKeys("manjesh");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LASTNAME_ID)));
		// driver.findElement(By.id(LASTNAME_ID)).sendKeys("yadav");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(COMPANY_ID)));
		driver.findElement(By.id(COMPANY_ID)).sendKeys("LTI");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ADDRESS_LINE_1_ID)));
		driver.findElement(By.id(ADDRESS_LINE_1_ID)).sendKeys("Sanpada");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ADDRESS_LINE_2_ID)));
		driver.findElement(By.id(ADDRESS_LINE_2_ID)).sendKeys("Navi Mumbai");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CITY_ID)));
		driver.findElement(By.id(CITY_ID)).sendKeys("Sanpada");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(STATE_ID)));

		driver.findElement(By.id(STATE_ID)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value='32']")));

		driver.findElement(By.cssSelector("option[value='32']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(POSTCODE_IS)));
		driver.findElement(By.id(POSTCODE_IS)).sendKeys("40070");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(COUNTRY_ID)));
		driver.findElement(By.id(COUNTRY_ID)).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("option[value='21']")));

		driver.findElement(By.cssSelector("option[value='21']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ADDITIONAL_INFORMATION_ID)));
		driver.findElement(By.id(ADDITIONAL_INFORMATION_ID)).sendKeys("Test");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(PHONE_ID)));
		driver.findElement(By.id(PHONE_ID)).sendKeys("0221234567");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(MOBILE_ID)));
		driver.findElement(By.id(MOBILE_ID)).sendKeys("1234567890");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ALIAS_ID)));
		driver.findElement(By.id(ALIAS_ID)).clear();
		driver.findElement(By.id(ALIAS_ID)).sendKeys("Home");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(CREATE_ID)));
		driver.findElement(By.id(CREATE_ID)).click();
		
		Thread.sleep(5000);

	}

}
