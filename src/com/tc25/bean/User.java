package com.tc25.bean;

public class User {

	private int userId;
	private String userName;
	private String userAcc;
	private String userPwd;
	private String userPwdTip;
	//ture 正常 false 黑名单
	private boolean userStatus;
	
	
	public User() {
		
	}

	

	public User(int userId, String userName, String userAcc, String userPwd, String userPwdTip, boolean userStatus) {
		
		this(userName,userAcc,userPwd,userPwdTip,userStatus);
		this.userId = userId;
	}

	

	
	public User(String userName, String userAcc, String userPwd, String userPwdTip, boolean userStatus) {
		super();
		this.userName = userName;
		this.userAcc = userAcc;
		this.userPwd = userPwd;
		this.userPwdTip = userPwdTip;
		this.userStatus = userStatus;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAcc() {
		return userAcc;
	}

	public void setUserAcc(String userAcc) {
		this.userAcc = userAcc;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	

	public String getUserPwdTip() {
		return userPwdTip;
	}



	public void setUserPwdTip(String userPwdTip) {
		this.userPwdTip = userPwdTip;
	}



	public boolean isUserStatus() {
		return userStatus;
	}



	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAcc=" + userAcc + ", userPwd=" + userPwd
				+ ", userPwdTip=" + userPwdTip + ", userStatus=" + userStatus + "]";
	}




	
	
}
