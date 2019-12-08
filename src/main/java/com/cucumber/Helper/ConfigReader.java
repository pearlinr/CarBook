package com.cucumber.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReader {
	Properties pp = new Properties();

	public ConfigReader() throws Exception {
		File file = new File(
				System.getProperty("user.dir") + "\\src\\test\\rsource\\com\\cucumber\\configure\\prop\\config.prop");
		FileInputStream fin = new FileInputStream(file);
		pp.load(fin);
	}

	public String getBrowserName() throws Exception {
		String br = pp.getProperty("browserName");
		if (br == null) {
			throw new Exception("Invalid browser name");
		}
		return br;
	}

	public String getURL() throws Exception {
		String url = pp.getProperty("urlWebPage");
		if (url == null) {
			throw new Exception("Invalid url");
		}
		return url;
	}

	public String getCountry() {
		String country = pp.getProperty("country");
		return country;
	}

	public String getEmail() {
		String email = pp.getProperty("Email");
		return email;
	}

	public String Name() {
		String name = pp.getProperty("Name");
		return name;
	}

	public String PostCode() {
		String postCode = pp.getProperty("PostCode");
		return postCode;
	}
	public String city() {
		String city = pp.getProperty("City");
		return city;
	}
	public String street() {
		String street = pp.getProperty("Street");
		return street;
	}
	public String cardNumber() {
		String cardNumber = pp.getProperty("cardNumber");
		return cardNumber;
	}
	public String expiryDate() {
		String expiryDate = pp.getProperty("expiryDate");
		return expiryDate;
	}
	public String cvc() {
		String cvc = pp.getProperty("cvc");
		return cvc;
	}
	public String implicityWait() {
		String wait = pp.getProperty("implicitWait");
		return wait;
	}
}
