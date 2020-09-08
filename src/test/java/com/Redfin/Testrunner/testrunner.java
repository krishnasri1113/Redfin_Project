package com.Redfin.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},glue= {"com.Redfin.SteDefinitionFile"},
plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"})
public class testrunner {

}
