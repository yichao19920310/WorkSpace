package com.tc25.view;

import com.tc25.data.UserList;

public class SetPwdView extends View {

	@Override
	public View showView() {
		System.out.println("=====>设置密码");
		System.out.println("请输入原密码");
		String pwd = iT.getString();
		if(pwd.equals(user.getUserPwd())) {
			System.out.println("请输入新密码");
			String newPwd = iT.getString();
			System.out.println("请确认新密码");
			String newPwd2 = iT.getString();
			if(newPwd.equals(newPwd2)) {
				user.setUserPwd(newPwd);
				UserList list = UserList.getInstance();
				list.addToAccMap(user.getUserAcc(), newPwd);
				System.out.println("密码设置成功!");
				
			}else {
				System.out.println("密码设置失败!");
			}
		}else {
			System.out.println("密码错误!");
		}
		mView = new UserMenuView();
		return mView;
	}

}
