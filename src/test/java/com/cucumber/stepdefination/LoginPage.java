package com.cucumber.stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.cucumber.tests.Testcases;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends Testcases

{
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.out.println("Executing step defination...............");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://www.google.com");
	}
//	@Given("^User is on Home Page$")
//	public void user_is_on_Home_Page() throws Throwable {
//		System.out.println("Executing step defination...............");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
//		driver.get("https://www.google.com");
//	}

	@When("^enter username$")
	public void enter_username() throws Throwable {
		Testcases.driver.findElement(By.id("username")).sendKeys("Admin");
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		Testcases.driver.findElement(By.id("password")).sendKeys("Admin123");
		Testcases.driver.findElement(By.id("Inpatient Ward")).click();
		Testcases.driver.findElement(By.id("loginButton")).click();
	}

	@Then("^verify Msg$")
	public void verify_Msg() throws Throwable {
		boolean result = Testcases.driver.findElement(By.tagName("h4")).getText().contains("Logged");
		Assert.assertTrue(result);
}
}