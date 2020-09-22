package com.ijmeet.functionaltests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ijmeet.base.Testbase;
import com.ijmeet.keywords.FEKeywords;
import com.ijmeet.pages.JoinMeetingPage;

public class JoinMeetingTestCases extends JoinMeetingPage{
	@BeforeClass
	public void clickOnJoinMeeting() {
		FEKeywords.clickOnElement("XPATH", "//a[@href='https://ijmeet.com/app']");
	}
	
	@Test
	public void verifyQuikeJoinAMeetingTextVisibilityTest() {
		JoinMeetingPage join=PageFactory.initElements(FEKeywords.driver, JoinMeetingPage.class);
		join.isQuikeJoinAMeetingTextVisible();
		String acutalText=join.getTextquikeJoinAMeetingText();
		String expectedText="Quick Join a Meeting";
		Assert.assertEquals(acutalText, expectedText);
		
		
		
	}
	@Test
	public void verifyLeftArrowVisibilityAndClickabilityTest() {
		JoinMeetingPage join=PageFactory.initElements(FEKeywords.driver, JoinMeetingPage.class);
		Assert.assertTrue(join.isLeftArrowVisible());	
		join.isLeftArrawClickable();
		String newUrl=FEKeywords.driver.getCurrentUrl();
		String expectedUrl="https://ijmeet.com/";
		Assert.assertEquals(newUrl, expectedUrl);
	}
	@Test
	public void verifyEnterYourNameTextboxTest() {
		JoinMeetingPage join=PageFactory.initElements(FEKeywords.driver, JoinMeetingPage.class);
		Assert.assertTrue(join.isTextboxVisible(enterNameTextbox));
		join.sendTextInTextbox(enterNameTextbox, "Sushil");
		String actualtext=join.getTextFromTextbox(enterNameTextbox);
		String expectedText="Sushil";
		Assert.assertEquals(actualtext, expectedText);
	}
	@Test
	public void verifyMeetingIdTextboxTest() {
		JoinMeetingPage join=PageFactory.initElements(FEKeywords.driver, JoinMeetingPage.class);
		Assert.assertTrue(join.isTextboxVisible(enterMeetingIdTextbox));
		join.sendTextInTextbox(enterMeetingIdTextbox, "Doiphode");
		String actualtext=join.getTextFromTextbox(enterMeetingIdTextbox);
		String expectedText="Doiphode";
		Assert.assertEquals(actualtext, expectedText);
	}
	@Test
	public void verifyJoinMeetingVisibility() {
		JoinMeetingPage join=PageFactory.initElements(FEKeywords.driver, JoinMeetingPage.class);
		Assert.assertTrue(join.isJoinMeetingButtonVisible());	
	}
	/*
	public static void verifyJoinMeetingTest() throws InterruptedException {
		String username1 = "abd";
		String meetingId = "yjf";
		JoinMeetingPage join=PageFactory.initElements(FEKeywords.driver, JoinMeetingPage.class);
		if (username1 != null && meetingId == null) {
			join.sendValueToTextBox(username, "abcd123");
			join.clickOnJoinMeetingButton();
			String actualText = join.getErrorMessage1();
			System.out.println(actualText);
			String expectedText = "Please enter meeting id.";
			Assert.assertEquals(actualText, expectedText);

		}
		else if(username1==null && meetingId!=null) {
			join.sendValueToTextBox(meetingid, "abc");
			join.clickOnJoinMeetingButton();
			String actualText = join.getErrorMessage2();
			System.out.println(actualText);
			String expectedText = "Please enter user name.";
			Assert.assertEquals(actualText, expectedText);
		}
		else if(username1!=null && meetingId!=null) {
			join.sendValueToTextBox(meetingid, "abc");
			join.sendValueToTextBox(username, "abcd123");
			join.clickOnJoinMeetingButton();
			String actualText = join.getErrorMessage3();
			System.out.println(actualText);
			String expectedText = "Meeting not found";
			Assert.assertEquals(actualText, expectedText);
		}
*/
}

