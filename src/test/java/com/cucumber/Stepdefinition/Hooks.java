package com.cucumber.Stepdefinition;

import java.io.File;
import java.io.IOException;

import com.cucumber.Baseclass.BaseClass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {
@After
public void failedCase(Scenario s) throws IOException {
	if (s.isFailed()) {
		File hts=BaseClass.screenShot(s.getName());
		Reporter.addScreenCaptureFromPath(hts.getAbsolutePath());
	
	}
}
}
