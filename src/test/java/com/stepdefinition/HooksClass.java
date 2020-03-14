package com.stepdefinition;

import org.base.BaseClass;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
@Before
	public void beforeExecution() {
		launchBrowser();
		driver.manage().window().maximize();
	}

	@After
	public void afterExecution() {
		driver.quit();
	}

}
