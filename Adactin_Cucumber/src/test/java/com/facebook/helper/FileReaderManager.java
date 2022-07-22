package com.facebook.helper;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
	
	}
	//Static method
	public static FileReaderManager getInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getCrInstance() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;

	}
	

}
