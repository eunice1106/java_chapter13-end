package com.eunice.ch_11_2;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar now = Calendar.getInstance();
		//Calendar now = new Calendar();->추상클래스이므로 new 연산자 사용 불가
		
		int nowYear = now.get(Calendar.YEAR);//현재 연도를 반환
		System.out.println(nowYear);
	}

}
