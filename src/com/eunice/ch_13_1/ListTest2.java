package com.eunice.ch_13_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {
		
		Member member1 = new Member("홍길동", 27, "010-7702-4080", "경기도 성남시");
		Member member2 = new Member("이순신", 31, "010-7689-4030", "서울시 용산구");
		Member member3 = new Member("김유신", 45, "010-7646-4890", "경기도 안양시");
		
		//리스트의 이름 memberlist
		
		ArrayList<Member> memberlist = new ArrayList<Member>();
		
		memberlist.add(member1);
		memberlist.add(member2);
		memberlist.add(member3);
		
		
		
		
		
		
		
	}

}
