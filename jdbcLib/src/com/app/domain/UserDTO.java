package com.app.domain;

public class UserDTO {
//	CREATE TABLE TBL_USER2(
//			   user_number NUMBER,
//			   user_id varchar2(100) NOT NULL,
//			   user_pw varchar2(100) NOT NULL,
//			   user_name varchar2(100) NOT NULL,
//			   user_phone NUMBER UNIQUE,
//			   CONSTRAINT pk_user2 PRIMARY KEY(user_number)
//			);

	// 필드
	private int userNumber;
	private String userId;
	private String userPw;
	private String userName;
	private String userPhone;

	// 생성자

	public UserDTO() {

	};
	

	public UserDTO(String userId, String userPw, String userName, String userPhone) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userPhone = userPhone;
	}


	// getset
	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	// toString
	@Override
	public String toString() {
		return "UserDTO [userNumber=" + userNumber + ", userId=" + userId + ", userPw=" + userPw + ", userName="
				+ userName + ", userPhone=" + userPhone + "]";
	}

}
