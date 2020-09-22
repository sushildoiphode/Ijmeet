package com.ijmeet.base;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import com.ijmeet.keywords.FEKeywords;

public class Testbase {
	@BeforeTest
	public void openingBrowser() throws InterruptedException {
		FEKeywords.openBrowser("Chrome");
		FEKeywords.LaunchUrl("https://ijmeet.com/");
		Thread.sleep(15000);
	}
	@AfterTest
	public void closingBrowser()  {
		FEKeywords.quiteBrowser();
	
	}
	

}
