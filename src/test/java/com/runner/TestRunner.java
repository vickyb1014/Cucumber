package com.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "com.stepdefinition", dryRun = false, monochrome = true, plugin = {"html:target", "json:tartget/reports.json"})

public class TestRunner {	
}

