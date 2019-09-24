package com.sungju.io;

import java.io.File;

public class FileTest03 {
	public static void main(String[] args) {
		File f = new File("c:\\Sungju\\test2\\sub1");
		//String[] list = f.list();
		File[] af = f.listFiles();
		
		for (int i = 0; i < af.length; i++) {
			af[i].delete();
		}
		
		/**
		 * 
		 */
	}

}
