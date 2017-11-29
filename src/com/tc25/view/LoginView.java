package com.tc25.view;

import com.tc25.bean.User;
import com.tc25.bizImpl.Loginer;

public class LoginView extends View {

	@Override
	public View showView() {
		System.out.println("=====>µÇÂ¼");
		Loginer l = new Loginer();
		user = l.login();
		if(user != null) {
			mView = new UserMenuView();
		}else {
			mView = new MainView();
		}
		
		return mView;
	}

}
