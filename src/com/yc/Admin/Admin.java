package com.yc.Admin;

public class Admin {

	private int adminId;
	private String adminName;
	private String adminAcc;
	private String adminPwd;
	private String adminGendar;
	private int adminLevel;
	
	public Admin() {
		
	}
	
	public Admin(int adminId, String adminName, String adminAcc, String adminPwd) {
		this(adminId,adminName,adminAcc,adminPwd,"ÄÐ",1);
	}


	public Admin(int adminId, String adminName, String adminAcc, String adminPwd, String adminGendar, int adminLevel) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminAcc = adminAcc;
		this.adminPwd = adminPwd;
		this.adminGendar = adminGendar;
		this.adminLevel = adminLevel;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminAcc() {
		return adminAcc;
	}

	public void setAdminAcc(String adminAcc) {
		this.adminAcc = adminAcc;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public String getAdminGendar() {
		return adminGendar;
	}

	public void setAdminGendar(String adminGendar) {
		this.adminGendar = adminGendar;
	}

	public int getAdminLevel() {
		return adminLevel;
	}

	public void setAdminLevel(int adminLevel) {
		this.adminLevel = adminLevel;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminAcc=" + adminAcc + ", adminGendar="
				+ adminGendar + ", adminLevel=" + adminLevel + "]";
	}
	
	
}