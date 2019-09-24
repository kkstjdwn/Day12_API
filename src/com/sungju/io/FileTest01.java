package com.sungju.io;

import java.io.File;

public class FileTest01 {
	
	public static void main(String[] args) {
		File f = new File("C:\\Sungju\\test2");
		System.out.println(f.exists());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		
		
		f = new File("c:\\Sungju\\test2\\t1");
		if (!f.exists()) {
			f.mkdir(); //makedirectory 
		}
		
		f = new File("c:\\Sungju\\test2","t1.txt");
		System.out.println(f.isFile());
		
		f.delete();
	}

}
