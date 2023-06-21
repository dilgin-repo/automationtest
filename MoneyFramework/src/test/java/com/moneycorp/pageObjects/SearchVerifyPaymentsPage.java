package com.moneycorp.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchVerifyPaymentsPage {
	
WebDriver ldriver;
	
	
	public SearchVerifyPaymentsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="nav_search")
	@CacheLookup
	WebElement  SearchBox;
	
	@FindBy(xpath="//h2[contains(text(),'Search Moneycorp')]")
	@CacheLookup
	WebElement Resulttxt;
	
	
	
	public void Searchtxt()
	{
		SearchBox.sendKeys("international payments");
	}
	public void VerifyResult()
	{
		 String ActualResult = Resulttxt.getText();
		 String ExpectedResult = "Search Moneycorp";
		 Assert.assertEquals(ActualResult,ExpectedResult,"Expected and Actual are not same"); 
	}
	public void VerifyLinks()
	{
		List<WebElement> articles = ldriver.findElements(By.cssSelector("body > section > section > div.container.search-results > div.results-wrapper > div:nth-child(1) > div.text > a"));

        
        for (WebElement article : articles) {
            
            String link = article.getAttribute("href");

            
            if (link.startsWith("https://www.moneycorp.com/en-us/")) {
                System.out.println("Valid link: " + link);
            } else {
                System.out.println("Invalid link: " + link);
            }
        }
	}
  
}
