package com.tc25.view;

public class UserMenuView extends View {

	@Override
	public View showView() {
		showMenu();
		return mView;
	}
	
	public void showMenu() {
		System.out.println("=====>�û��˵�");
		System.out.println("1.�鿴������Ϣ");
		System.out.println("2.�����ǳ�");
		System.out.println("3.��������");
		System.out.println("4.����������ʾ");
		System.out.println("5.�鿴�ɽ�DVD");
		System.out.println("6.�鿴DVD�ȶ�����");
		System.out.println("7.���DVD");
		System.out.println("8.�黹DVD");
		int choose = it.getInt();
		switch(choose) {
		case 1:
			mView = new UserInfoView();
			break;
		case 2:
			mView = new SetNameView();
			break;
		case 3:
			mView = new SetPwdView();
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		default:
			break;
			
		}
	}

}
