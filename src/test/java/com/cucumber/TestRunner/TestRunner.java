package com.cucumber.TestRunner;

import java.io.File;

import org.junit.*;
import org.junit.runner.RunWith;


import com.cucumber.Baseclass.BaseClass;
import com.cucumber.Helper.ConfigReader;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\rsource\\com\\cucumber\\ExtentReports\\extent.html"},
		features="src\\test\\java\\com\\cucumber\\feature",
		glue="com.cucumber.Stepdefinition",
	//	dryRun=true,strict=true,
		monochrome=true
		)
public class TestRunner extends BaseClass {

@BeforeClass
public static void browserLaunch() throws Exception {
	ConfigReader cr=new ConfigReader();
	browserName();
}
@AfterClass
public static void quit() {
	driver.quit();
	Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\rsource\\com\\cucumber\\configure\\prop\\extent-config.xml"));
}
}
