package com.tc25.view;

public class SetNameView extends View {

	@Override
	public View showView() {
		System.out.println("=====>�����ǳ�");
		System.out.println("���������ǳ�");
		String name = iT.getString();
		user.setUserName(name);
		System.out.println("���óɹ�!");
		mView = new UserMenuView();
		return mView;
	}

}
