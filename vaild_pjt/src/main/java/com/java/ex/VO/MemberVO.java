package com.java.ex.VO;

import javax.validation.constraints.Size;

public class MemberVO {
	@Size(max = 10, message = "아이디는 10글자 까지만 입력해주세요")
	private String userId;

	@Size(max = 5, message = "비밀번호는 5글자 까지만 입력해주세요")
	private String password;

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getUserId() {
		return userId;
	}
}
