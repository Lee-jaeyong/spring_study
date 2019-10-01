package com.java.ex.VO;

import javax.validation.constraints.Size;

public class MemberVO {
	@Size(max = 10, message = "���̵�� 10���� ������ �Է����ּ���")
	private String userId;

	@Size(max = 5, message = "��й�ȣ�� 5���� ������ �Է����ּ���")
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
