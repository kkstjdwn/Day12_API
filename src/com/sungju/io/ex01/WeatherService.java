package com.sungju.io.ex01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class WeatherService {

	private File f;
	private FileReader fr;
	private BufferedReader br;
	private String wi;
	private boolean check = true;
	private StringBuffer sb;
	private StringTokenizer st;
	private Weather weather;


	public void init(ArrayList<Weather> aw) {
		this.f = new File("c:\\test\\sub1", "weatherInfo.txt");
		System.out.println("존재여부 : " + f.exists());
		try {
			this.fr = new FileReader(f);
			this.br = new BufferedReader(fr);

			while ((this.wi = br.readLine()) != null) {
				 this.st = new StringTokenizer(wi, ",");
				 
//				String[] sa = this.wi.split(",");
//				this.weather.setCity(sa[0].trim());
//				this.weather.setGion(Double.parseDouble(sa[1].trim()));
//				this.weather.setSpdo(Integer.parseInt(sa[2].trim()));
//				this.weather.setStatus(sa[3].trim());

				this.weather = new Weather();
				this.weather.setCity(st.nextToken().trim());
				this.weather.setGion(Double.parseDouble(st.nextToken().trim()));
				this.weather.setSpdo(Integer.parseInt(st.nextToken().trim()));
				this.weather.setStatus(st.nextToken().trim());

				aw.add(weather);
				// NumberFormatException

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				this.br.close();
				this.fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		System.out.println("입력완료");
	}

}
