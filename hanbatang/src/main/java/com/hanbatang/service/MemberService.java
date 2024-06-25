package com.hanbatang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbatang.dto.Member;
import com.hanbatang.mapper.MemberMapper;

@Service // 어떤 서비스를 제공할 것인지 작성하는 공간
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;

	// 기존에는 눈에 보기 편하게 하기 위해 멤버가입이라는 메서드명을 작성해줬지만
	// Mapper.xml 파일에 존재하는 insert id값으로 변경해서 작성해주기

	public void insertMember(Member member) {
         //나중에 비밀번호 설정이나 정규식이나
		//비밀번호 일치여부와 같은 모든 기능을 작성
		memberMapper.insertMember(member);
	}
}
