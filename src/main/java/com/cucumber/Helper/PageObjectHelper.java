package com.cucumber.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.Pom.ContactPage;
import com.cucumber.Pom.HomePage;
import com.cucumber.Pom.Register;

public class PageObjectHelper {
private HomePage hp;
private ContactPage cp;
private Register rp;
public WebDriver driver;	

public PageObjectHelper(WebDriver xdriver) {
	this.driver=xdriver;
}
public HomePage getHp() {
	if (hp==null) {
		hp=new HomePage(driver);
	}
	return hp;
}
public ContactPage getCp() {
	return cp;
}
public Register getRp() {
	if (rp==null) {
		rp=new Register(driver);
	}
	return rp;
}

}
