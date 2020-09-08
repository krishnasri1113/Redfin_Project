package com.Redfin.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class commonUtilites {
	public static Properties props=new Properties();
	static FileInputStream filein;
	 Logger log = Logger.getLogger(getClass().getSimpleName());
	
	
	public void loadlog4jproperties(String PropertyFilePath) throws Exception
	{
		log.info("Log4j PropertyFile Path "+PropertyFilePath);
		filein=new FileInputStream(PropertyFilePath);
		props.load(filein);
		PropertyConfigurator.configure(props);
	}
	public void loadconfigproperties(String PropertiesFilePath) throws Exception
	{
		log.info("Config PropertyFile Path "+PropertiesFilePath);
		filein=new FileInputStream(PropertiesFilePath);
		props.load(filein);
		System.getProperties().putAll(props);
		
	}
	
	
	

}
