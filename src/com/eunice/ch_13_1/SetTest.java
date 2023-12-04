package com.eunice.ch_13_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		//Set는 인터페이스라 자식클래스인 HashSet으로 객체선언해야함
		
		set.add("홍길동");
		set.add("김유신");
		set.add("홍길동");
		set.add("이순신");
		
		//Set은 인덱스가 없다. for문을 어떻게 돌리나? iterator 사용/ Set은 중복제거때 사용
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String result = iterator.next();//1개씩 객체를 반환함			
			System.out.println(result);
		
		}
		
		
		
	}

}
