package com.sungju.io.ex01;

import java.util.ArrayList;

import java.util.Scanner;

public class WeatherMenu {
	private int choice;
	private Scanner sc;
	private Weather weather;
	private boolean check;
	private WeatherService service;
	private ArrayList<Weather> aw;
	private WeatherView view;
	
	public WeatherMenu() {
		this.choice = 0;
		this.sc = new Scanner(System.in);
		this.weather = new Weather();
		this.check=true;
		this.service= new WeatherService();
		this.aw = new ArrayList<Weather>();
		this.view = new WeatherView(); 
		
	}
	
	public void start() {
while (this.check) {
			
			System.out.println("1.날씨정보 초기화");
			System.out.println("2.날씨정보 추가");
			System.out.println("3.전체정보 출력");
			System.out.println("4.지역정보검색");
			System.out.println("5.지역정보삭제");
			System.out.println("6.프로그램종료");
			System.out.println("원하는 메뉴의 번호를 입력하세요");
			this.choice = sc.nextInt();
			
			switch (this.choice) {
			case 1:
				this.service.init(this.aw);
				break;
				
			case 2 :
				
				
				break;
				
			case 3:
				this.view.view(aw);
				break;
			case 4 :
				
				break;
			case 5:
				
				break;
			case 6: 
				System.out.println("프로그램종료");
				check = !check;
				break;

			default:
				System.out.println("다시 입력하세요");
				break;
			}
			
			
		}
		
		
		
	}

}
