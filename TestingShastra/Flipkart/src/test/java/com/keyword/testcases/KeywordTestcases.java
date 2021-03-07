package com.keyword.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.flipkart.keywords.FEKeywords;

public class KeywordTestcases extends FEKeywords {
	@BeforeTest
	public void launchBrowser() {
		FEKeywords.openBrowser("Chrome");
		FEKeywords.maximizeBrowser();
		FEKeywords.openUrl("https://www.flipkart.com/");
	}

	public void verifyLogoVisibility() {
		// TODO Auto-generated method stub

	}
	
	

}
