package com.tc25.view;

import com.tc25.bizImpl.Register;

public class RegistView extends View {

	@Override
	public View showView() {
		System.out.println("=====>зЂВс");
		Register r = new Register();
		r.regist();
		mView = new MainView();
		return mView;
	}

}
