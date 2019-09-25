package com.sungju.io.ex01;

import java.util.ArrayList;


public class WeatherView {
	
	
	public static void main(String[] args) {
		int [] a = {10,30,60,90};
		
		for(int num : a) {
			System.out.println(num);
		}
	}
	
	public void view(ArrayList<Weather> aw) {
//		for (int i = 0; i < aw.size(); i++) {
//			System.out.println("CITY\t: "+aw.get(i).getCity());
//			System.out.println("TEMP\t: "+aw.get(i).getGion());
//			System.out.println("HUML\t: "+aw.get(i).getSpdo());
//			System.out.println("STUS\t: "+aw.get(i).getStatus());
//			System.out.println("----------------");
//		}
		/**
		 * 향상된 for문
		 * for(저장된 DateType 변수명 : 컬렉션변수명) {}
		 */
		for (Weather weather : aw) {
			
			System.out.println("CITY\t: "+weather.getCity());
			System.out.println("TEMP\t: "+weather.getGion());
			System.out.println("HUML\t: "+weather.getSpdo());
			System.out.println("STUS\t: "+weather.getStatus());
			System.out.println("----------------");

			
		}
		
		
		
		
	}

}
