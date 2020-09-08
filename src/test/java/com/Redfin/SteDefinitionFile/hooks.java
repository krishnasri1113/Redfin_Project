package com.Redfin.SteDefinitionFile;



import com.Redfin.utilites.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends TestBase {
	
	@Before
	public void seting_up_Environment() throws Exception
	{
		brwutil.launchbrowser("ch");
		loaddepencies();
		driver.get(System.getProperty("QAEnvironmentURL"));
		System.out.println(System.getProperty("QAEnvironmentURL"));
		
	}
	@After
	public void quit_browser()
	{
		driver.close();
	}

}
