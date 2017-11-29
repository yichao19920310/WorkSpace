package com.tc25.view;

import com.tc25.tools.InputTool;

public class MainView extends View {

	
	@Override
	public View showView() {
		welcome();
		showMenu();
		
		return mView;
	}
	
	public void welcome() {
		System.out.println("************************************");
		System.out.println("\t��ӭʹ��DVD������");
		System.out.println("************************************");
	}
	
	public void showMenu(){
		System.out.println("1.ע��");
		System.out.println("2.��¼");
		System.out.println("3.�˳�");
		int choose = it.getInt();
		switch(choose) {
		case 1:
			mView = new RegistView();
			break;
		case 2:
			mView = new LoginView();
			break;
		case 3:
			mView = null;
			break;
		default:
			mView = new MainView();
			break;
		}
	}

}
