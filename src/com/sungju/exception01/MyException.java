package com.sungju.exception01;

public class MyException extends Exception{
	
	@Override
	public String getMessage() {
	Exception e = new Exception();
	e.printStackTrace();
		return super.getMessage();
	}

}
