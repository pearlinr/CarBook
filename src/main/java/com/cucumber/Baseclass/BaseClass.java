package com.cucumber.Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserName() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\rsource\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}

	public static String getURL(String url) {
		driver.get(url);
		return url;
	}

	public static void elementVisibility(WebElement element) {
		WebDriverWait wd = new WebDriverWait(driver, 60);
		WebElement until = wd.until(ExpectedConditions.visibilityOf(element));
	}

	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static File screenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File dc = new File(System.getProperty("user.dir") + "\\src\\test\\rsource\\ScreenShot\\" + filename + ".png");
		FileUtils.copyFile(sc, dc);
		return dc;
	}

	public static void scrollPage(int width, int height) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(width,height");
	}

	public static void windowHandles() {
		String f = driver.getWindowHandle();
		Set<String> p = driver.getWindowHandles();
		for (String q : p) {
			if (!q.equals(f)) {
				driver.switchTo().window(q);
			}
		}
	}

	public static void selectByValue(WebElement element, String options, String value) {
		Select sc = new Select(element);
		if (options == "index") {
			int i = Integer.parseInt(value);
			sc.selectByIndex(i);
		}
		if (options == "value") {
			sc.selectByValue(value);
		}
		if (options == "text") {
			sc.selectByVisibleText(value);
		}
	}

	public static void keyToSend(WebElement element, String key) {
		isDisplayed(element);
		isEnabled(element);
		element.sendKeys(key);
	}
}
