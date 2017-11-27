package com.tc25.dao;

import com.tc25.bean.User;

public interface UserManage {

	public void addUser();
	
	public User subUserById(int id);
	
	public User subUserByAcc(String acc);
	
	public void showAllUser();
	
	public User showUserById(int id);
	
	public User showUserByAcc(String acc);
	
	public boolean setUserStatus(User u);
	
	public boolean resetUserPwd(User u);
	
	
}
