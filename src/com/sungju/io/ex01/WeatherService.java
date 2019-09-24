package com.sungju.io.ex01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		try {
			this.f = new File("c:\\test\\sub1", "weatherInfo.txt");
			this.fr = new FileReader(f);
			this.br = new BufferedReader(fr);
			this.sb = new StringBuffer();
			aw = new ArrayList<Weather>();

			while (check) {
				this.wi = String.valueOf(br.readLine());
				if (wi == null) {
					break;
				}
				this.sb.append(wi.replaceAll(" ", ""));
			}
			this.st = new StringTokenizer(sb.toString(), ",");
			while (st.hasMoreTokens()) {
				this.weather = new Weather();
				this.weather.setCity(st.nextToken());
				this.weather.setGion(Double.parseDouble(st.nextToken()));
				this.weather.setSpdo(Integer.parseInt(st.nextToken()));
				this.weather.setStatus(st.nextToken());
				aw.add(weather);

			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
