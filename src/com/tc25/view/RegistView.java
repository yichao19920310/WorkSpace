package com.tc25.view;

import com.tc25.bizImpl.Register;

public class RegistView extends View {

	@Override
	public View showView() {
		System.out.println("=====>ע��");
		Register r = new Register();
		r.regist();
		mView = new MainView();
		return mView;
	}

}
