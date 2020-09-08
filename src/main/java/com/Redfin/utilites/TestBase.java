package com.Redfin.utilites;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import cucumber.api.java.After;
import cucumber.api.java.Before;
			

public class TestBase {
	public static WebDriver driver=null;
	 public static BrowserUtilites brwutil=new BrowserUtilites();
	 public static commonUtilites commonutil=new commonUtilites();
	
	 public void loaddepencies() throws Exception {
		commonutil.loadconfigproperties(System.getProperty("user.dir")+"/src/main/resources/Properties/Config.properties");
	}

	
	

	
}
