package com.tc25.view;

public class SetNameView extends View {

	@Override
	public View showView() {
		System.out.println("=====>设置昵称");
		System.out.println("请输入新昵称");
		String name = it.getString();
		user.setUserName(name);
		System.out.println("设置成功!");
		mView = new UserMenuView();
		return mView;
	}

}
