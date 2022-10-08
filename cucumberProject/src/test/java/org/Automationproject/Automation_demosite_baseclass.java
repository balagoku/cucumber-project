package org.Automationproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_demosite_baseclass {
	public static WebDriver driver;

	public static WebDriver getbrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("browser name is not mathced");
		}
		driver.manage().window().maximize();
		return driver;

	}
	public static void Url(String url) {
		driver.get(url);
	}
	
	public static void frame(int value) {
		driver.switchTo().frame(value);
	}
	public static void frame_default() {
		driver.switchTo().defaultContent();
	}
	
	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void on_click(WebElement element) {
		element.click();
	}
	public static void explicitWait(WebElement element,int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	public static void moveTo_Element(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	public static void moveTo_Elementand_click(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		act.click().build().perform();
	}

	public static void sendkeys(WebElement element,String name) {
		element.sendKeys(name);
	}

	public static int select_byindex(WebElement element, int number) {
		Select value = new Select(element);
		value.selectByIndex(number);
		return number;
	}
}
