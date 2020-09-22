package com.ijmeet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ijmeet.utility.HomePageInitiator;

public class HomePage {
	@FindBy(xpath = "//img[@src='https://ijmeet.com/images/LOGO-F@2x.png']")
	private static WebElement logo;
	@FindBy(xpath = "//a[@href='https://ijmeet.com/app']")
	private static WebElement joinMeeting;
	@FindBy(xpath = "//a[@href='https://ijmeet.com/host_meeting']")
	private static WebElement hostMeeting;
	@FindBy(xpath = "//nav/div/div/ul/li/a[@href='https://ijmeet.com/contact']")
	private static WebElement contactSales;
	@FindBy(xpath = "//a[@href='https://ijmeet.com/login']")
	private static WebElement signIn;
	@FindBy(xpath = "//li/a[@href='https://ijmeet.com/register']")
	private static WebElement signUp;
	@FindBy(xpath = "//a[@data-lang='ar']")
	private static WebElement arabic;
	@FindBy(xpath = "//img[@src='https://ijmeet.com/images/profile_img/android.png']")
	private static WebElement androidIcon;
	@FindBy(xpath = "//img[@src='https://ijmeet.com/images/profile_img/ios.png']")
	private static WebElement appleIcon;
	@FindBy(xpath = "//img[@src='https://ijmeet.com/images/profile_img/windows.png']")
	private static WebElement windowsIcon;
	@FindBy(xpath = "//div[@class='mirror-view-to']")
	private static WebElement ijmeetForRemoreTeamColaborationText;
	@FindBy(xpath = "//h2[text()='   Trusted by industry across the  world  ']")
	private static WebElement trustedByIndustryAcrosssTheWorldText;
	@FindBy(xpath = "/html/body/div[2]/div/section[2]/div/div/div[2]/div/div/div[@class='mirror-view-to-chat-st']")
	private static WebElement chatMessageText;
	@FindBy(xpath = "/html/body/div[2]/div/section[3]/div/div/div[1]/div/div/div[@class='mirror-view-to-chat-st']")
	private static WebElement videoConferencingText;
	@FindBy(xpath = "/html/body/div[3]/footer/div[2]/div[2]")
	public static WebElement helpAndSupport;
	
	
	public boolean isLogoVisible() {
		return logo.isDisplayed();
	}
	public void clickOnLogo() {
		logo.click();
	}
	public static boolean isJoinMeetingVisible() {
		return joinMeeting.isDisplayed();
	}
	public void clickOnJoinMeeting() {
		joinMeeting.click();
	}
	public boolean isHostMeetingVisible() {
		return hostMeeting.isDisplayed();
	}
	public void clickOnHostMeeting() {
		hostMeeting.click();
	}
	public boolean isContactSalesVisible() {
		return contactSales.isDisplayed();
	}
	public void clickOnContactSales() {
		contactSales.click();
	}
	public boolean isSignInVisible() {
		return signIn.isDisplayed();
	}
	public void clickOnSignIn() {
		signIn.click();
	}
	public boolean isSignUpVisible() {
		return signUp.isDisplayed();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
	public boolean isArabicWordVisible() {
		return arabic.isDisplayed();
	}
	public void clickOnArabic() {
		arabic.click();
	}
	public boolean isAndroidIconVisible() {
		return androidIcon.isDisplayed();
	}
	public void clickOnAndroid() {
		androidIcon.click();
	}
	public boolean isAppleIconVisible() {
		return appleIcon.isDisplayed();
	}
	public void clickOnapple() {
		appleIcon.click();
	}
	public boolean isWindowsIconVisible() {
		return windowsIcon.isDisplayed();
	}
	public void clickOnWindows() {
		windowsIcon.click();
	}
	public boolean isIjmeetForRemoreTextVisible() {
		return ijmeetForRemoreTeamColaborationText.isDisplayed();
	}
	public boolean isTrustedByIndustryAcrosssTheWorldTextVisibility() {
		return trustedByIndustryAcrosssTheWorldText.isDisplayed();
	}
	public boolean isChatMessageTextVisibility() {
		return chatMessageText.isDisplayed();
	}
	public boolean isVideoConferencingTextVisibility() {
		return videoConferencingText.isDisplayed();
	}
	public boolean isFooterHelpAndSupportSublistVisibility() {
		return helpAndSupport.isDisplayed();
	}

}
