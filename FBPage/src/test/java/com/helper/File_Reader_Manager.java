package com.helper;

import java.io.IOException;

public class File_Reader_Manager {
	private File_Reader_Manager() {
		
	}
	public Configuration_Reader getInstanceCr() throws IOException {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
	
	
	public static File_Reader_Manager getInstance() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}

	
	
	
	
}
