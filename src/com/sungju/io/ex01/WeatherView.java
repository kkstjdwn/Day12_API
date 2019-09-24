package com.sungju.io.ex01;

import java.util.ArrayList;


public class WeatherView {
	
	public void view(ArrayList<Weather> aw) {
		for (int i = 0; i < aw.size(); i++) {
			System.out.println("CITY :\t"+aw.get(i).getCity());
			System.out.println("TEMP :\t"+aw.get(i).getGion());
			System.out.println("HUML :\t"+aw.get(i).getSpdo());
			System.out.println("STUS :\t"+aw.get(i).getStatus());
			System.out.println("----------------");
		}
		
		
		
		
	}

}
