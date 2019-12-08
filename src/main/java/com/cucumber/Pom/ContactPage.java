package com.cucumber.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	public WebDriver driver;
	public ContactPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath="//a[text()='Contact']//parent::li")
	private WebElement contact;
	@FindBy(xpath="//ul[@class='contact-info']//following-sibling::li")
	private WebElement phone;
	@FindBy(xpath="//a[text()='carbook@autosafety.org']//parent::li")
	private WebElement email;
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getContact() {
		return contact;
	}
}
