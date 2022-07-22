//Class :StateDetails
//Methods :southIndia(),northIndia()
//
//Description:
//Create an object for LanguageInfo and StateDetails inside the StateDetails class and call both classes methods also follow the all coding standards.
package org.lang;

public class LanuageInfo {

	public void tamilLanguage() {
		System.out.println("You have Choosen Tamil");

	}
	public void englishLanguage() {
		System.out.println("You have Choosen English");

	}
	public void hindiLanguage() {
		System.out.println("You have Choosen Hindi");

	}
	
	public static void main(String[] args) {
		LanuageInfo li = new LanuageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
	}
}
