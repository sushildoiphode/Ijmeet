package com.ijmeet.functionaltests;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.base.Testbase;
import com.ijmeet.keywords.FEKeywords;
import com.ijmeet.pages.HomePage;


public class HomePageTestCases extends Testbase {
	
	@Test
	public void verifyIsLogoVisibilityTest() {	
		HomePage home = PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isLogoVisible(), "Logo not found");
		FEKeywords.log.info("Logo is Visible");
		home.clickOnLogo();
		Assert.assertEquals(FEKeywords.driver.getCurrentUrl(), "https://ijmeet.com/home", "Url Mismatch");	
	}
	@Test
	public void verifyIsJoinMeetingVisibilityTest() {
		HomePage home = PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isJoinMeetingVisible());
		home.clickOnJoinMeeting();
		Assert.assertEquals(FEKeywords.driver.getCurrentUrl(), "https://ijmeet.com/app", "Url Mismatch");
	}

	@Test
	public void verifyIsHostMeetingVisibilityTest() {
		HomePage home = PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isHostMeetingVisible());
		home.clickOnHostMeeting();
		Assert.assertEquals(FEKeywords.driver.getCurrentUrl(), "https://ijmeet.com/host_meeting", "Url Mismatch");
	}

	@Test
	public void verifyIsContactSalesVisibilityTest() {
		HomePage home = PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isContactSalesVisible());
		home.clickOnContactSales();
		Assert.assertEquals(FEKeywords.driver.getCurrentUrl(), "https://ijmeet.com/contact", "Url Mismatch");
	}

	@Test
	public void verifyIsSignInVisibilityTest() {
		HomePage home = PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isSignInVisible());
		home.clickOnSignIn();
		Assert.assertEquals(FEKeywords.driver.getCurrentUrl(), "https://ijmeet.com/login", "Url Mismatch");
	}

	@Test
	public void verifyIsSignUpVisibilityTest() {
		HomePage home = PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isSignUpVisible());
		home.clickOnSignUp();
		Assert.assertEquals(FEKeywords.driver.getCurrentUrl(), "https://ijmeet.com/register", "Url Mismatch");
	}

	@Test
	public void verifyIsArabicVisibilityTest() {
		HomePage home = PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isArabicWordVisible());
		home.clickOnArabic();
		Assert.assertEquals(FEKeywords.driver.getCurrentUrl(), "https://ijmeet.com/#", "Url Mismatch");
	}

	@Test
	public void verifyAndroidIconVisibilityTest() {
		HomePage home = PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isAndroidIconVisible());
		home.clickOnAndroid();
		String parenthandle = FEKeywords.driver.getWindowHandle();
		Set<String> handle = FEKeywords.driver.getWindowHandles();
		Iterator itr = handle.iterator();
		while (itr.hasNext()) {
			String object = (String) itr.next();
			if (!object.equals(parenthandle)) {
				FEKeywords.driver.switchTo().window(object);
				String actualUrl = FEKeywords.driver.getCurrentUrl();
				String expectedUrl = "https://play.google.com/store/apps/details?id=com.gcnt.ijmeet";
				Assert.assertEquals(actualUrl, expectedUrl, "Url Mismatch");
			}
		}
	}
	@Test
	public void verifyAppleIconVisibilityAndClickabilityTest() {
		HomePage home=PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isAppleIconVisible());
		home.clickOnapple();
		String parentHandle=FEKeywords.driver.getWindowHandle();
		Set handles=FEKeywords.driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		while (itr.hasNext()) {
			String value = (String) itr.next();
			if (!value.equals(parentHandle)) {
				FEKeywords.driver.switchTo().window(value);
				String actualUrl=FEKeywords.driver.getCurrentUrl();
				String expectedUrl="https://apps.apple.com/us/app/id1524001778";
				Assert.assertEquals(actualUrl, expectedUrl,"Url Mismatch");
				}	
		}
	}
	@Test
	public void verifyWindowsIconVisibilityAndClickabilityTest() {
		HomePage home=PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isWindowsIconVisible());
		home.clickOnWindows();
		String parentHandle=FEKeywords.driver.getWindowHandle();
		Set handles=FEKeywords.driver.getWindowHandles();
		Iterator<String> itr=handles.iterator();
		while (itr.hasNext()) {
			String handleValue = (String) itr.next();
			if (!handleValue.equals(parentHandle)) {
				FEKeywords.driver.switchTo().window(handleValue);
				String ActualUrl=FEKeywords.driver.getCurrentUrl();
				String expectedUrl="https://www.microsoft.com/en-in/p/ijmeet/9ns1d2jcx4v0#activetab=pivot:overviewtab";		
				Assert.assertEquals(ActualUrl, expectedUrl,"Url Mismatch");
			}
			
		}
	}
	@Test
	public void verifyIjmeetForRemoteTeamColaborationTextVisibility() {
		HomePage home=PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isIjmeetForRemoreTextVisible());
	}
	@Test
	public void verifyTrustedByIndustryAcrosssTheWorldTextVisibility() {
		HomePage home=PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isTrustedByIndustryAcrosssTheWorldTextVisibility());
	}
	@Test
	public void verifyChatMessageTextVisibility() {
		HomePage home=PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isChatMessageTextVisibility());
	}
	@Test
	public void verifyVideoConferencingTextVisibility() {
		HomePage home=PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isVideoConferencingTextVisibility());
	}
	@Test
	public void verifyHelpAndSupportFooterVisibility() {
		HomePage home=PageFactory.initElements(FEKeywords.driver, HomePage.class);
		Assert.assertTrue(home.isFooterHelpAndSupportSublistVisibility());		
	}
}
