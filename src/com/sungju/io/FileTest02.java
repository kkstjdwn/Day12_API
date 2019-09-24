package com.sungju.io;

import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File file = new File("c:\\Sungju\\test2\\sub1\\sub2");
		file.mkdirs();
		
		file = new File("c:\\Sungju\\test2\\sub1");
		file.delete();
	}

}
