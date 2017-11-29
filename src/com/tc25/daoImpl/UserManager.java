package com.tc25.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;

import com.tc25.bean.User;
import com.tc25.bizImpl.Register;
import com.tc25.dao.UserManage;
import com.tc25.data.UserList;

public class UserManager implements UserManage {

	private UserList uL = UserList.getInstance();
	private ArrayList<User> userList = uL.getUserList();
	private ArrayList<Integer> idList = uL.getIdList();
	private HashMap<String,String> accMap = uL.getAccMap();
	final String DEFAULT_PWD = "123456";
	
	@Override
	public void addUser() {
		Register reg = new Register();
		reg.regist();
	}

	@Override
	public User subUserById(int id) {
		User user = showUserById(id);
		if(user != null) {
			userList.remove(user);
			accMap.remove(user.getUserAcc());
			return user;
		}
		return null;
	}

	@Override
	public User subUserByAcc(String acc) {
		User user = showUserByAcc(acc);
		if(user != null) {
			userList.remove(user);
			accMap.remove(user.getUserAcc());
			return user;
		}
		return null;
	}

	@Override
	public void showAllUser() {
		for (User user : userList) {
			System.out.println(user.toString());
		}
		
	}

	@Override
	public User showUserById(int id) {
		for (User user : userList) {
			if(id == user.getUserId()) {
				System.out.println(user.toString());
				return user;
			}
		}
		return null;
	}

	@Override
	public User showUserByAcc(String acc) {
		for (User user : userList) {
			if(acc == user.getUserAcc()) {
				System.out.println(user.toString());
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean setUserStatus(User u) {
		if(u.isUserStatus() == false) {
			u.setUserStatus(true);
			return true;
		}
		return false;
	}

	@Override
	public boolean resetUserPwd(User u) {
		
		u.setUserPwd(DEFAULT_PWD);
		return true;
	}

	
	
}
