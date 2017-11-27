package com.yc.Admin;

import java.util.ArrayList;

import com.tc25.bean.User;

public class AdminManage {

	ArrayList<Admin> adminList = new ArrayList<>();
	ArrayList<Integer> idList = new ArrayList<>();
	ArrayList<String> accList = new ArrayList<>();
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
	}
	public boolean addAdmin(Admin admin) {
		if(admin == null) {
			return false;
		}
		adminList.add(admin);
		return true;
	}
	
	public Admin subAdminById(int id) {
		for (Admin admin : adminList) {
			if(admin.getAdminId() == id) {
				adminList.remove(admin);
				return admin;
			}
		}
		return null;
	}
	
	public Admin subAdminByAcc(String acc) {
		for (Admin admin : adminList) {
			if(admin.getAdminAcc() == acc) {
				adminList.remove(admin);
				return admin;
			}
		}
		return null;
	}
	
	public Admin checkAdminById(int id) {
		for (Admin admin : adminList) {
			if(admin.getAdminId() == id) {
				System.out.println(admin.toString());
				return admin;
			}
		}
		return null;
	}
	
	public Admin checkAdminByAcc(String acc) {
		for (Admin admin : adminList) {
			if(admin.getAdminAcc() == acc) {
				System.out.println(admin.toString());
				return admin;
			}
		}
		return null;
	}
	
	public void checkAllAdmin() {
		for (Admin admin : adminList) {			
			System.out.println(admin.toString());						
		}
	}
}
