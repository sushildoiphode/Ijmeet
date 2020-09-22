package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ijmeet.base.Testbase;

public class JoinMeetingPage extends Testbase {
	@FindBy(xpath = "//h2[text()='Quick Join a Meeting']")
	private static WebElement quikeJoinAMeetingText;
	@FindBy(xpath = "//a[@href='https://ijmeet.com']")
	private static WebElement leftArrow;
	@FindBy(xpath = "//input[@id='username']")
	public static WebElement enterNameTextbox;
	@FindBy(xpath = "//input[@id='meetingid']")
	public static WebElement enterMeetingIdTextbox;
	@FindBy(xpath = "//button[@id='before_start']")
	public static WebElement joinMeetingButton;
	@FindBy(xpath = "//p[@class='text-center mb-0']")
	public static WebElement errorMessageText1;
	
	public boolean isQuikeJoinAMeetingTextVisible() {
		return quikeJoinAMeetingText.isDisplayed();
	}
	public String getTextquikeJoinAMeetingText() {
		return quikeJoinAMeetingText.getText();
	}
	public boolean isLeftArrowVisible() {
		return leftArrow.isDisplayed();
	}
	public void isLeftArrawClickable() {
		leftArrow.click();
	}
	public boolean isTextboxVisible(WebElement name) {
		return name.isDisplayed();
	}
	public void sendTextInTextbox(WebElement name,String value) {
		name.sendKeys(value);	
	}
	public String getTextFromTextbox (WebElement name) {
		return name.getAttribute("value");
	}
	public boolean isJoinMeetingButtonVisible() {
		return joinMeetingButton.isDisplayed();
	}
	public void isJoinMeetingButtonClickable() {
		joinMeetingButton.click();
	}
	public String getErrorMessage1() {
		String errorText=errorMessageText1.getAttribute("innerHTML");
		return errorText;
	}
}
/*	public String getErrorMessage2() {
		String errorText=errorMessage2.getAttribute("innerHTML");
		return errorText;

	}
	public String getErrorMessage3() {
		String errorText=errorMessage3.getAttribute("innerHTML");
		return errorText;
	
}
*/