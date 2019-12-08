package com.cucumber.Stepdefinition;

import java.net.URL;

import org.apache.commons.math3.distribution.LevyDistribution;
import org.openqa.selenium.WebDriver;

import com.cucumber.Baseclass.BaseClass;
import com.cucumber.Helper.ConfigReader;
import com.cucumber.Helper.PageObjectHelper;
import com.cucumber.TestRunner.TestRunner;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass{
	public static WebDriver driver=TestRunner.driver;
	public static PageObjectHelper poh= new PageObjectHelper(driver);
	
	@Given("^Launch the browser and open the url$")
	public void launch_the_browser_and_open_the_url() throws Throwable {
		ConfigReader cr=new ConfigReader();
		getURL(cr.getURL());
	}

	@When("^Click on login/register button and proceed the register process$")
	public void click_on_login_register_button_and_proceed_the_register_process() throws Throwable {
		poh.getHp().getElement().click();
		poh.getHp().getRegisterArrow().click();
		windowHandles();
		poh.getRp().getLogin().click();
		poh.getRp().getRegister().click();
		poh.getRp().getMembership().click();
		poh.getRp().getProceed().click();		
	}

	@When("^Proceed to the payment$")
	public void proceed_to_the_payment() throws Throwable {
		ConfigReader cr=new ConfigReader();
		keyToSend(poh.getRp().getEmailFeild(), cr.getEmail());
		keyToSend(poh.getRp().getNameFeild(), cr.Name());
		keyToSend(poh.getRp().getCity(), cr.city());
		keyToSend(poh.getRp().getStreet(), cr.street());
		keyToSend(poh.getRp().getPostcode(), cr.PostCode());
		poh.getRp().getSubmit().click();
		keyToSend(poh.getRp().getCardNumber(), cr.cardNumber());
		keyToSend(poh.getRp().getExpiry(), cr.expiryDate());
		keyToSend(poh.getRp().getCvc(), cr.cvc());
		poh.getRp().getSubmitPay().click();
	}

	@When("^Check the contact details$")
	public void check_the_contact_details() throws Throwable {
	}
}
