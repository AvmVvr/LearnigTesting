package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties pro;

	public Configuration_Reader() throws IOException {

		File f = new File("C:\\Users\\venka\\eclipse-workspace\\FBPage\\src\\test\\java\\com\\helper\\fb.properties");
		FileInputStream fis = new FileInputStream(f);
		pro = new Properties(); // LV
		pro.load(fis);

	}

	public String browserName() {

		String browser = pro.getProperty("browser");
		return browser;

	}

	public String urlName() {

		String url = pro.getProperty("url");
		return url;
	}

}
