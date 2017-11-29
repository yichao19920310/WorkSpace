package com.tc25.view;

import com.tc25.bean.User;
import com.tc25.tools.InputTool;

public abstract class View {

	InputTool it = InputTool.getInstance();
	View mView;
	static User user;
	public abstract View showView();
}
