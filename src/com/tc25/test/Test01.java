package com.tc25.test;

import com.tc25.bizImpl.Loginer;
import com.tc25.bizImpl.Register;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Register r = new Register();
		r.regist();
		Loginer l = new Loginer();
		l.login();
		
		
	}

}
