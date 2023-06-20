package com.mycompony.study.ch15.first.tr;

import java.util.ArrayList;

public class ExMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Member> members = new ArrayList<Member>();
				
		Member member = new Member("천주아", "juacheon", "asasasas", 01000000000, "juacheon@naver");
		Member member2 = new Member("홍길동", "hong", "asasasas", 01000000000, "hong@naver");
		Member member3 = new Member("구준표", "ticket", "asasasas", 01000000000, "ticket@naver");
		
		members.add(member);
		members.add(member2);
		members.add(member3);
		
		for(Member a: members) {
			System.out.println(a.name);
		}
			
	}

}
