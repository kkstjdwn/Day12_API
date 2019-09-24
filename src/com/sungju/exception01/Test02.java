package com.sungju.exception01;

public class Test02 {
	
	public void cal(int n1, int n2) throws Exception{
		int num =n1+n2;
		if (num>99) {
			throw new MyException();
			
		}
		
		System.out.println(num);
		
		
	}

}
