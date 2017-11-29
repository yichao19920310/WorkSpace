package com.tc25.test;

import com.tc25.bizImpl.Loginer;
import com.tc25.bizImpl.Register;
import com.tc25.view.*;


public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		View view = new MainView();
		while(view != null) {
			view = view.showView();
		}
		System.out.println("欢迎下次使用!");
		
	}

}
