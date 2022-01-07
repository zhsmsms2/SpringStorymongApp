package com.storymomgapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.storymomgapp.domain.memberDTO;

@Mapper
public interface memberMapper {
	
	@Select("SELECT * FROM t_member WHERE mb_id= #{mb_id}")
	memberDTO selectMember(@Param("mb_id") long mb_id);
	
	@Select("SELECT * FROM t_member")
	List<memberDTO> selectMemberList();

	
}
