package com.tc25.view;

public class UserInfoView extends View {

	@Override
	public View showView() {
		System.out.println("=====>�û���Ϣ");
		System.out.println(user.toString());
		mView = new UserMenuView();
		return mView;
	}

}
