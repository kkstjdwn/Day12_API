package com.sungju.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputTest01 {

	public static void main(String args[]) {
		System.out.println("한글자");
		InputStream io = System.in;
		
		InputStreamReader ir = new InputStreamReader(io);
		BufferedReader br = new BufferedReader(ir);
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		try {
//			int num = ir.read();
//			char ch = (char)num;
//			System.out.println(ch);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
