package org.lang;
public class StateDetails {
	public void southIndia() {
		System.out.println("South India");
	}
	public void northIndia() {
		System.out.println("North India");
	}
	public static void main(String[] args) {
		LanuageInfo li = new LanuageInfo();
		StateDetails sd = new StateDetails();
		li.englishLanguage();
		li.hindiLanguage();
		li.tamilLanguage();
		sd.southIndia();
		sd.northIndia();
	}
}
