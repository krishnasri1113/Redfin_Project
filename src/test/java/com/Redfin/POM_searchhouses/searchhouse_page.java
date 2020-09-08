package com.Redfin.POM_searchhouses;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Redfin.utilites.TestBase;

public class searchhouse_page extends TestBase {
	
	Logger log=Logger.getLogger(getClass().getSimpleName());
	
	public searchhouse_page (WebDriver driver){
        TestBase.driver = driver;
	       //This initElements method will create all WebElements
         PageFactory.initElements(driver, this);

}  
	@FindBy(xpath="(//input[@name='searchInputBox'])[1]")
	WebElement searchbar;
	@FindBy(xpath="(//button[@data-rf-test-name='searchButton'][@aria-label='submit search'])[1]")
	WebElement searchcity;
	@FindBy(xpath="//div[contains(@class,'resultsView')]//div[1]//div[1]//div[2]//a[1]")
	WebElement selectcity;
	@FindBy(xpath="//div[@class='textContent']")
	WebElement citytext;
	@FindBy(xpath="//span[contains(@class,'field select Select quickMinPrice withFlyout withOptions mounted selected clickable optional')]")
	WebElement selectminprice;
	@FindBy(xpath="//span[contains(text(),'$800k')]")
	WebElement minprice;
	@FindBy(xpath="//span[contains(@class,'field select Select quickMaxPrice withFlyout withOptions mounted selected clickable optional')]")
	WebElement selectmaxprice;
	@FindBy(xpath="//span[contains(text(),'$950')]")
	WebElement maxprice;
	
	public void enter_the_city_name(String arg1) throws Exception
	{
		brwutil.waitElementToVisible(searchbar);
		
		searchbar.sendKeys(arg1);
		
	}
	public void search_the_city() throws Exception
	{
		brwutil.waitElementToVisible(searchcity);
		
		searchcity.click();
	}
	public void select_the_city()
	{
		brwutil.waitElementToVisible(selectcity);
		selectcity.click();
		//Assert.assertTrue();
	}
	public void select_min_price()
	{
		brwutil.waitElementToVisible(selectminprice);
		selectminprice.click();
		brwutil.waitElementToVisible(minprice);
       minprice.click();		
	}
	public void select_max_price()
	{
		brwutil.waitElementToVisible(selectmaxprice);
		selectmaxprice.click();
		brwutil.waitElementToVisible(maxprice);
		maxprice.click();
	}
	

}
