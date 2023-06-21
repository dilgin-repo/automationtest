package com.moneycorp.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ForeignExchangePage {
	
WebDriver ldriver;
	
	
	
	public   ForeignExchangePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//body/section/div[2]/div[4]/section/div/article[1]/div/a/span")
	WebElement  btn_FindMore;
	
	@FindBy(xpath="//h1[contains(text(),'Foreign exchange solutions for your business')]")
	WebElement Txt_Heading;
	
	
	public void FindMoreDetails()
	{
		btn_FindMore.click();
	}
	public void scrolldown()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
	}
	public void VerifyPage()
	{
		String ActualText = Txt_Heading.getText();
		String ExpectedText = "Foreign exchange solutions for your business";
		
		Assert.assertEquals(ActualText, ExpectedText,"Expected and Actual are not same");
	}

}
