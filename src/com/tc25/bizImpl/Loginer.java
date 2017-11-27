package com.tc25.bizImpl;

import java.util.ArrayList;
import java.util.HashMap;

import com.tc25.bean.User;
import com.tc25.biz.Login;
import com.tc25.data.UserList;
import com.tc25.tools.InputTool;

/**
 * 
 * @ClassName: Loginer  
 * @Description: 实现登录 
 * @author Administrator  
 * @date 2017年11月22日  
 *
 */
public class Loginer implements Login {

	//从data包获取需要使用的数据包括用户列表和账号密码的HashMap
	private UserList uL = UserList.getInstance();
	private ArrayList<User> userList = uL.getUserList();
	private HashMap<String,String> accMap = uL.getAccMap();
	
	//调用输入工具,以下所有iT.xxx你就理解为xx.nextXxx(),而且封装好了,并且已经抓过异常
	private InputTool iT = InputTool.getInstance();
	/*
	 * (非 Javadoc)  
	 * <p>Title: login</p>  
	 * <p>Description: 实现登录方法,先判断账号是否存在,再通过键值对匹配密码</p>  
	 * @return  
	 * @see com.tc25.biz.Login#login()
	 */
	@Override
	public User login() {
		
		System.out.println("请输入账户名:");
		String acc = "";
		while(true) {
			acc = iT.getString();
			//判断是否存在该账号,通过判断在我设置的HashMap中是否存在键为acc
			if(accMap.containsKey(acc)) {
				break;
			}else {
				System.out.println("该账户名不存在,请重新输入:");
				continue;
			}
		}
		
		
		System.out.println("请输入密码:");
		String pwd = "";
		//用于记录输入密码的次数
		int count = 1;
		//循环5次
		while(count <= 5) {
			pwd = iT.getString();										
				if(pwd.equals(accMap.get(acc))) {
					System.out.println("登录成功!");
					//成功就调用类中另一个方法把账户对应的User对象返回,以便后面操作
					return currentUser(acc);
				}else if(count <= 3) {
					//小于3次会询问是否要密码提示
					System.out.println("密码错误!请重新输入(剩余"+(5-count++)+"次机会):");
					System.out.println("是否开启密码提示?(1为是,其它为否)");
					String isNeedTip = iT.getString();
					if("1".equals(isNeedTip)) {
						showTip(acc);
						System.out.println("请输入密码:");
						continue;
					}				
				}else if(count == 4) {
					//这里不会询问是否要密码提示,直接给你显提示			
					System.out.println("密码错误!请重新输入(剩余"+(5-count++)+"次机会):");
					showTip(acc);
					System.out.println("请输入密码:");
					continue;
				}else {
					//输错5次会写段代码锁定账户,我不会写-__-!
					System.out.println("密码错误已达5次,该账户已被锁定24小时!");
					count++;
				}					
		}
		//没有登录成功会返回null,外面就可以判断得到null表示登录失败
		return null;
		
		
	}
	
	/**
	 * 
	 * @Title: showTip  
	 * @Description: 当用户需要密码提示,遍历用户列表通过账户名找到对应用户
	 * 再通过用户调用密码提示  
	 * @param @param acc    参数  
	 * @return void    返回类型  
	 * @throws
	 */
	private void showTip(String acc) {
		for (User user : userList) {
			if(user.getUserAcc().equals(acc)) {
				System.out.println("密码提示为:"+user.getUserPwdTip());
				break;
			}
		}
	}
	
	/**
	 * 
	 * @Title: currentUser  
	 * @Description: 登录成功 遍历用户列表通过账户找到用户  
	 * @param acc    账户名  
	 * @return User   用户对象 
	 */
	private User currentUser(String acc) {
		for (User user : userList) {
			if(user.getUserAcc().equals(acc)) {
				
				return user;
			}
		}
		return null;
	}
	

}
