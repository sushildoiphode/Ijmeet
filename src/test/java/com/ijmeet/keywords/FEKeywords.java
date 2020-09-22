package com.ijmeet.keywords;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FEKeywords {
	public static WebDriver driver;
	public static Logger log=Logger.getLogger(FEKeywords.class);
	
	public static void openBrowser(String browserName) {
		switch (browserName) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			log.info("Chrome opened");
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		case "InternateExplorer":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		default:
			System.out.println("Invalid Browser open");
			break;
		}	
	}
	
	public static void LaunchUrl(String url) {
		driver.get(url);
	}
	
	public static WebElement getWebElement(String locatorType,String locatorValue) {
		WebElement element=null;
		switch (locatorType) {
		case "XPATH":
			element=driver.findElement(By.xpath(locatorValue));
			break;
		case "CSS":
			element=driver.findElement(By.cssSelector(locatorValue));
			break;
		case "ID":
			element=driver.findElement(By.id(locatorValue));
			break;
		case "LINK_TEXT":
			element=driver.findElement(By.linkText(locatorValue));
			break;
		case "PARTIAL_LINK_TEXT":
			element=driver.findElement(By.partialLinkText(locatorValue));
			break;
		case "NAME":
			element=driver.findElement(By.name(locatorValue));
			break;
		case "TAGNAME":
			element=driver.findElement(By.tagName(locatorValue));
			break;
		case "CLASSNAME":
			element=driver.findElement(By.className(locatorValue));
			break;

		default:
			System.out.println("Unable find Locator type"+locatorType);
			break;
		}
		return element;
	}
	
	public static void clickOnElement(String locatorType,String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}
	public static void enterText(String locatorType,String locatorValue,String enterText) {
		getWebElement(locatorType, locatorValue).sendKeys(enterText);
	}
	public static void dropDown(String locatorType,String locatorValue,String enterText) {
		WebElement e=getWebElement(locatorType, locatorValue);
		Select s=new Select(e);
		s.selectByVisibleText(enterText);
	}
	public static boolean isElementDisplayed(String locatorType,String locatorValue) {
		return getWebElement(locatorType, locatorValue).isDisplayed();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void quiteBrowser() {
		driver.quit();
	}
}
