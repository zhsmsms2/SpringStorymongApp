package com.storymomgapp.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class memberDTO {
	
	/** 번호 (PK) */
	private Long mb_id;

	/** 이메일 */
	private String mb_email;

	/** 비밀번호 */
	private String mb_password;

	/** 휴대폰 */
	private String mb_phone;

	/** 회원분류 */
	private String mb_type;

	/** 성별 */
	private String mb_gender;

	/** 닉네임 */
	private String mb_name;

	/** 생년월일 */
	private String mb_birthdt;

	/** 활동여부 */
	private String mb_status;

	/** 마케팅수신동의 */
	private String mb_marketing;

	/** 등록일 */
	private LocalDateTime reg_dt;

	/** 등록일 */
	private LocalDateTime mod_dt;

	/** 인증 */
	private String mb_auth;

	/** 회원사진 */
	private String mb_pic;
	private String old_mb_pic_file;
	private String default_pic;
	
	private int mb_dream;
	private int mb_point;
	private String author_reg;
}
