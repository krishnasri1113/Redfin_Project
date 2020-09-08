package com.Redfin.SteDefinitionFile;

import org.apache.log4j.Logger;

import com.Redfin.POM_searchhouses.searchhouse_page;
import com.Redfin.utilites.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinitionfile extends TestBase {
	
	searchhouse_page searchhousepage=new searchhouse_page(driver);
	Logger log=Logger.getLogger(getClass().getSimpleName());
//	@Before
//	public void set_up()
//	{
//		 
//		brwutil.launchbrowser("ch");
//		driver.get("https://www.redfin.com");
//		searchhousepage=new searchhouse_page(driver);
//	}
//	@After
//	public void quit_browser()
//	{
//		driver.quit();
//	}
	
	@When("^Redfin site is launched$")
	public void redfin_site_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		log.info("Redfin site is launched");
	   
	}

	@Given("^when user enter the \"([^\"]*)\" name$")
	public void when_user_enter_the_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
				searchhousepage.enter_the_city_name(arg1);
				log.info("user entered the city name");
		
	  
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		searchhousepage.search_the_city();
		log.info("user clicked on search button");
	   
	}

	@Then("^select the city name from the list$")
	public void select_the_city_name_from_the_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	   searchhousepage.select_the_city();
	   log.info("user selected the city name from the list of cities");
	}

	

	@Then("^Select min house price$")
	public void select_min_house_price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchhousepage.select_min_price();
		log.info("user select the minimum price");
	    
	}
	@Then("^Select max house price$")
	public void select_max_house_price() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchhousepage.select_max_price();
		log.info("user selected the maximum price");
	    
	}




}
