package com.storymomgapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.storymomgapp.domain.memberDTO;
import com.storymomgapp.mapper.memberMapper;

@RestController
public class memberController {
	
	private memberMapper mapper;
	
	
	public memberController(memberMapper mapper) {
		super();
		this.mapper = mapper;
	}

	@GetMapping("/member/{mb_id}")
	public memberDTO selectMember(@PathVariable("mb_id") long mb_id) {
		memberDTO member = mapper.selectMember(mb_id);
		
		return member;
	}
	
	@GetMapping("/member")
	public List<memberDTO> selectMemberList() {
		List<memberDTO> member = mapper.selectMemberList();
		
		return member;
	}
}
