package org.selenium.project;

public class demoss extends BaseClass {

	public static void main(String[] args) {
		getDriver("firefox");
		getUrl("https://www.facebook.com/");
		currentUrl();
	}

}
