package com.facebook.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	// Assigning Properties as class variable
	Properties ps;
	//creating non parameterized constructor to implement the actions inside it while creating object.
	public ConfigurationReader() throws IOException {
		// property file path
		File fp = new File("src\\test\\java\\com\\facebook\\helper\\facebook.property");
		FileInputStream fis = new FileInputStream(fp);
		ps = new Properties();
		ps.load(fis);
	}
	public String launchBrowser() {
		String browser = ps.getProperty("Browser");
		return browser;
	}
	public String launchUrl() {
		String webAddress = ps.getProperty("url");
		return webAddress;
	}
}