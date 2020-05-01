package com.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetupPage {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static JavascriptExecutor executor;
	static String usrDir = System.getProperty("user.dir");

	public static void setUp(String appUrl) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();

		executor = (JavascriptExecutor) driver;
		driver.get(appUrl);

	}

	public static void closeDriver() throws Exception {

		driver.quit();

	}

}
