package com.stepdefinition;

import java.util.Map;

import org.openqa.selenium.By;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition{
	@Given("User has to be there in FB login page")
	public void user_has_to_be_there_in_FB_login_page() {
		HooksClass.driver.get("https://www.facebook.com/");

	}

	@When("User has to enter username, password and click the login button")
	public void user_has_to_enter_username_password_and_click_the_login_button(io.cucumber.datatable.DataTable d) {
		Map<String, String> mp = d.asMap(String.class, String.class);
		HooksClass.driver.findElement(By.id("email")).sendKeys(mp.get("username"));
		HooksClass.driver.findElement(By.id("pass")).sendKeys(mp.get("password"));
		HooksClass.driver.findElement(By.id("loginbutton")).click();
	}

	@Then("User has to find the home page")
	public void user_has_to_find_the_home_page() {
		System.out.println("done");
	}

	@When("User has to enter valid username, password and click the login button")
	public void user_has_to_enter_valid_username_password_and_click_the_login_button() {
		HooksClass.driver.findElement(By.id("email")).sendKeys("vicky2");
		HooksClass.driver.findElement(By.id("pass")).sendKeys("1234");
		HooksClass.driver.findElement(By.id("loginbutton")).click();
	}

	@Then("User has to find the error page")
	public void user_has_to_find_the_error_page() {
		System.out.println("Logged in succesfully");
	}

}
