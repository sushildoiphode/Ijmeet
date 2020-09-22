package com.ijmeet.functionaltests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.base.Testbase;
import com.ijmeet.keywords.FEKeywords;
import com.ijmeet.utility.FileUtil;

public class HomePageTestThrKeywords extends Testbase {
	Logger log = Logger.getLogger(HomePageTestThrKeywords.class);
	@Test
	public void verifyLogoVisibilityAndClickabilityTest() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("logoImage")));
		//log.error("error found");
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("logoImage"));
		String acutalUrl=FEKeywords.driver.getCurrentUrl();
		String expectedUrl="https://ijmeet.com/home";
		Assert.assertEquals(acutalUrl, expectedUrl);
		//log.info("Logo is visible and clickable");
	}
	@Test
	public void isJoinMeetingTest() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("joinMeeting")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("joinMeeting"));
		String acutalUrl=FEKeywords.driver.getCurrentUrl();
		String expectedUrl="https://ijmeet.com/app";
		Assert.assertEquals(acutalUrl, expectedUrl);
	}
	@Test
	public void isHostMeetingTest() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("hostMeeting")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("hostMeeting"));
		String acutalUrl=FEKeywords.driver.getCurrentUrl();
		String expectedUrl="https://ijmeet.com/host_meeting";
		Assert.assertEquals(acutalUrl, expectedUrl);
	}
	@Test
	public void isContactSalesTest() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("contactSales")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("contactSales"));
		String acutalUrl=FEKeywords.driver.getCurrentUrl();
		String expectedUrl="https://ijmeet.com/contact";
		Assert.assertEquals(acutalUrl, expectedUrl);
	}
	@Test
	public void isSignInTest() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("signIn")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("signIn"));
		String acutalUrl=FEKeywords.driver.getCurrentUrl();
		String expectedUrl="https://ijmeet.com/login";
		Assert.assertEquals(acutalUrl, expectedUrl);
	}
	@Test
	public void isSignUpTest() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("signUp")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("signUp"));
		String acutalUrl=FEKeywords.driver.getCurrentUrl();
		String expectedUrl="https://ijmeet.com/register";
		Assert.assertEquals(acutalUrl, expectedUrl);
	}
	@Test
	public void isArabicTest() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("arabic")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("arabic"));
		String acutalUrl=FEKeywords.driver.getCurrentUrl();
		String expectedUrl="https://ijmeet.com/#";
		Assert.assertEquals(acutalUrl, expectedUrl);
	}
	@Test
	public void verifyAndroidVisibleAndClickable() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("androidIcon")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("androidIcon"));
		String parentHandle=FEKeywords.driver.getWindowHandle();
		Set handles=FEKeywords.driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		while (itr.hasNext()) {
			String newHandle = (String) itr.next();
			if (!newHandle.equals(parentHandle)) {
				FEKeywords.driver.switchTo().window(newHandle);
				String actualUrl=FEKeywords.driver.getCurrentUrl();
				String expectedUrl="https://play.google.com/store/apps/details?id=com.gcnt.ijmeet";
				Assert.assertEquals(actualUrl, expectedUrl,"URL Mismatch");	
			}	
		}
	}
	@Test
	public void verifyAppleVisibleAndClickable() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("appleIcon")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("appleIcon"));
		String parentHandle=FEKeywords.driver.getWindowHandle();
		Set handles=FEKeywords.driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		while (itr.hasNext()) {
			String newHandle = (String) itr.next();
			if (!newHandle.equals(parentHandle)) {
				FEKeywords.driver.switchTo().window(newHandle);
				String actualUrl=FEKeywords.driver.getCurrentUrl();
				String expectedUrl="https://apps.apple.com/us/app/id1524001778";
				Assert.assertEquals(actualUrl, expectedUrl,"URL Mismatch");	
				
			}	
		}
	}
	@Test
	public void verifyWindowsVisibleAndClickable() {
		Assert.assertTrue(FEKeywords.isElementDisplayed("XPATH", FileUtil.getProperty("windowsIcon")));
		FEKeywords.clickOnElement("XPATH", FileUtil.getProperty("windowsIcon"));
		String parentHandle=FEKeywords.driver.getWindowHandle();
		Set handles=FEKeywords.driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		while (itr.hasNext()) {
			String newHandle = (String) itr.next();
			if (!newHandle.equals(parentHandle)) {
				FEKeywords.driver.switchTo().window(newHandle);
				String actualTitle=FEKeywords.driver.getTitle();
				String expectedTitle="Get IJmeet - Microsoft Store en-IN";
				Assert.assertEquals(actualTitle, expectedTitle,"Title Mismatch");	
			}	
		}
	}
	@Test
	public void verifyFooterHelpAndSupportSublistVisible() throws InterruptedException {
		Thread.sleep(20000);
		WebElement menu=FEKeywords.getWebElement("XPATH", FileUtil.getProperty("helpAndSupport"));
		List<WebElement> menuTextText=menu.findElements(By.tagName("a"));
		List<String> actualMenuText=new ArrayList<String>();
		Iterator<WebElement> itr= menuTextText.iterator();
		while (itr.hasNext()) {
			String menuText=(itr.next()).getText();
			actualMenuText.add(menuText);
		}
		List<String> expectedMenu= new ArrayList<String>();
		expectedMenu.add("Support");
		expectedMenu.add("Contact Us");
		Assert.assertTrue(expectedMenu.containsAll(actualMenuText));
	}
	@Test
	public void verifyFooterInfoSublistVisible(){
	
		WebElement menu=FEKeywords.getWebElement("XPATH", FileUtil.getProperty("info"));
		List<WebElement> menuTextText=menu.findElements(By.tagName("a"));
		List<String> actualMenuText=new ArrayList<String>();
		Iterator<WebElement> itr= menuTextText.iterator();
		while (itr.hasNext()) {
			String menuText=(itr.next()).getText();
			actualMenuText.add(menuText);
		}
		List<String> expectedMenu= new ArrayList<String>();
		expectedMenu.add("About Us");
		expectedMenu.add("Terms & Conditions");
		expectedMenu.add("Privacy Policy");
		Assert.assertTrue(expectedMenu.containsAll(actualMenuText));
	}
	@Test
	public void verifyFooterSocialSublistVisible() throws InterruptedException {
		Thread.sleep(20000);
		WebElement menu=FEKeywords.getWebElement("XPATH", FileUtil.getProperty("social"));
		List<WebElement> menuTextText=menu.findElements(By.tagName("a"));
		List<String> actualMenuText=new ArrayList<String>();
		Iterator<WebElement> itr= menuTextText.iterator();
		while (itr.hasNext()) {
			String menuText=(itr.next()).getText();
			actualMenuText.add(menuText);
		}
		List<String> expectedMenu= new ArrayList<String>();
		expectedMenu.add("Twitter");
		expectedMenu.add("Facebook");
		expectedMenu.add("Google +");
		expectedMenu.add("Instagram");
		Assert.assertTrue(expectedMenu.containsAll(actualMenuText));
	}

}

