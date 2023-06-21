package com.moneycorp.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaunchingPage {
	
	WebDriver ldriver;
	
	
	public LaunchingPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="language-dropdown-flag")
	@CacheLookup
	WebElement  LanguageButton;
	
	@FindBy(xpath="//img[@alt='USA English']")
	@CacheLookup
	WebElement SelLanguage;
	
	
	
	public void OpenLangDrop()
	{
		LanguageButton.click();
	}
	public void SelectLang()
	{
		SelLanguage.click();
	}
	
	public void VerifyLang()
	{
		Boolean p = (Boolean) ((JavascriptExecutor)ldriver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", SelLanguage);
		
		if(p)
		{
			System.out.println("Language changed");
		}
		else
		{
			System.out.println("Language not changed");
		}
	}
}
