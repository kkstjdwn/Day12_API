package com.sungju.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileTest04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\Sungju\\test2\\sub1", "1.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			boolean check = true;

			while (check) {
				String str = br.readLine();
				if (str==null) {
					break;
				}
				System.out.println(str);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//해제순서 : 연결의 역순으로
			try {
				br.close();
				fr.close();
				sc.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
