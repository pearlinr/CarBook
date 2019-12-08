package com.cucumber.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	public WebDriver driver;
	public Register(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="THE_CAR_BOOK_RE.V.R1.CONTROLBAR_2.Login")
	private WebElement login;
	@FindBy(xpath="//td[text()='Get it Free with Membership']")
	private WebElement membership;
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;
	@FindBy(id="CONTROL_BAR1.V.R1.CONTROLBAR_2.Register")
	private WebElement register;
	@FindBy(xpath="//label[text()='Email']//parent::div[@class='Textbox-inputRow']")
	private WebElement emailFeild;
	@FindBy(xpath="//label[text()='Name']//parent::div[@class='Textbox-inputRow']")
	private WebElement nameFeild;
	@FindBy(xpath="//label[text()='Street']//parent::div[@class='Textbox-inputRow']")
	private WebElement Street;
	@FindBy(xpath="//label[text()='City']//parent::div[@class='Textbox-inputRow']")
	private WebElement city;
	@FindBy(xpath="//label[text()='Postcode']//parent::div[@class='Textbox-inputRow']")
	private WebElement postcode;
	@FindBy(xpath="//label[text()='Country']")
	private WebElement country;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="//label[text()='Card number']//parent::div[@class='Textbox-inputRow']")
	private WebElement cardNumber;
	@FindBy(xpath="//label[text()='Expiry']//parent::div[@class='Textbox-inputRow']")
	private WebElement expiry;
	@FindBy(xpath="//label[text()='CVC']//parent::div[@class='Textbox-inputRow']")
	private WebElement cvc;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitPay;
	@FindBy(xpath="//span[@aria-label='Close']")
	private WebElement closePay;
	
	public WebElement getClosePay() {
		return closePay;
	}
	public WebElement getEmailFeild() {
		return emailFeild;
	}
	public WebElement getNameFeild() {
		return nameFeild;
	}
	public WebElement getStreet() {
		return Street;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getPostcode() {
		return postcode;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getCardNumber() {
		return cardNumber;
	}
	public WebElement getExpiry() {
		return expiry;
	}
	public WebElement getCvc() {
		return cvc;
	}
	public WebElement getSubmitPay() {
		return submitPay;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getMembership() {
		return membership;
	}
	public WebElement getProceed() {
		return proceed;
	}
	
}
