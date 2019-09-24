package com.sungju.exception01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;

		System.out.println("숫자");

		try {
			age = sc.nextInt();
			age = 5 / age;
			

		} catch (InputMismatchException i) {
			System.out.println("숫자만 입력하셈");
			

		} catch(ArithmeticException a) {
			System.out.println("이상한짓 하지마세요");
		} catch(Exception e) {
			e.printStackTrace(); // 발생한 Exception을 출력해준다
			System.out.println("다시하세요");
			
		}

		System.out.println("AGE : " + age);

	}

}
