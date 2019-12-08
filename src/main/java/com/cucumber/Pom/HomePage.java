package com.cucumber.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
public HomePage(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//*[@id=\"menu-wrapper\"]/div/div[3]/ul/li[2]/a")
private WebElement element;
@FindBy(xpath="/html/body/div[3]/div[1]/div/div[3]/div/div[1]/button/i")
private WebElement registerArrow;

public WebElement getRegisterArrow() {
	return registerArrow;
}
public WebElement getElement() {
	return element;
}

}

