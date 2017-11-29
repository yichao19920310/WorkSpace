package com.tc25.view;

public class UserMenuView extends View {

	@Override
	public View showView() {
		showMenu();
		return mView;
	}
	
	public void showMenu() {
		System.out.println("=====>用户菜单");
		System.out.println("1.查看个人信息");
		System.out.println("2.设置昵称");
		System.out.println("3.设置密码");
		System.out.println("4.设置密码提示");
		System.out.println("5.查看可借DVD");
		System.out.println("6.查看DVD热度排行");
		System.out.println("7.借出DVD");
		System.out.println("8.归还DVD");
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
