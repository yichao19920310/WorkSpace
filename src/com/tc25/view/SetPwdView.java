package com.tc25.view;

import com.tc25.data.UserList;

public class SetPwdView extends View {

	@Override
	public View showView() {
		System.out.println("=====>��������");
		System.out.println("������ԭ����");
		String pwd = iT.getString();
		if(pwd.equals(user.getUserPwd())) {
			System.out.println("������������");
			String newPwd = iT.getString();
			System.out.println("��ȷ��������");
			String newPwd2 = iT.getString();
			if(newPwd.equals(newPwd2)) {
				user.setUserPwd(newPwd);
				UserList list = UserList.getInstance();
				list.addToAccMap(user.getUserAcc(), newPwd);
				System.out.println("�������óɹ�!");
				
			}else {
				System.out.println("��������ʧ��!");
			}
		}else {
			System.out.println("�������!");
		}
		mView = new UserMenuView();
		return mView;
	}

}
