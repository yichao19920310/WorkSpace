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
 * @Description: ʵ�ֵ�¼ 
 * @author Administrator  
 * @date 2017��11��22��  
 *
 */
public class Loginer implements Login {

	//��data����ȡ��Ҫʹ�õ����ݰ����û��б���˺������HashMap
	private UserList uL = UserList.getInstance();
	private ArrayList<User> userList = uL.getUserList();
	private HashMap<String,String> accMap = uL.getAccMap();
	
	//�������빤��,��������iT.xxx������Ϊxx.nextXxx(),���ҷ�װ����,�����Ѿ�ץ���쳣
	private InputTool iT = InputTool.getInstance();
	/*
	 * (�� Javadoc)  
	 * <p>Title: login</p>  
	 * <p>Description: ʵ�ֵ�¼����,���ж��˺��Ƿ����,��ͨ����ֵ��ƥ������</p>  
	 * @return  
	 * @see com.tc25.biz.Login#login()
	 */
	@Override
	public User login() {
		
		System.out.println("�������˻���:");
		String acc = "";
		while(true) {
			acc = iT.getString();
			//�ж��Ƿ���ڸ��˺�,ͨ���ж��������õ�HashMap���Ƿ���ڼ�Ϊacc
			if(accMap.containsKey(acc)) {
				break;
			}else {
				System.out.println("���˻���������,����������:");
				continue;
			}
		}
		
		
		System.out.println("����������:");
		String pwd = "";
		//���ڼ�¼��������Ĵ���
		int count = 1;
		//ѭ��5��
		while(count <= 5) {
			pwd = iT.getString();										
				if(pwd.equals(accMap.get(acc))) {
					System.out.println("��¼�ɹ�!");
					//�ɹ��͵���������һ���������˻���Ӧ��User���󷵻�,�Ա�������
					return currentUser(acc);
				}else if(count <= 3) {
					//С��3�λ�ѯ���Ƿ�Ҫ������ʾ
					System.out.println("�������!����������(ʣ��"+(5-count++)+"�λ���):");
					System.out.println("�Ƿ���������ʾ?(1Ϊ��,����Ϊ��)");
					String isNeedTip = iT.getString();
					if("1".equals(isNeedTip)) {
						showTip(acc);
						System.out.println("����������:");
						continue;
					}				
				}else if(count == 4) {
					//���ﲻ��ѯ���Ƿ�Ҫ������ʾ,ֱ�Ӹ�������ʾ			
					System.out.println("�������!����������(ʣ��"+(5-count++)+"�λ���):");
					showTip(acc);
					System.out.println("����������:");
					continue;
				}else {
					//���5�λ�д�δ��������˻�,�Ҳ���д-__-!
					System.out.println("��������Ѵ�5��,���˻��ѱ�����24Сʱ!");
					count++;
				}					
		}
		//û�е�¼�ɹ��᷵��null,����Ϳ����жϵõ�null��ʾ��¼ʧ��
		return null;
		
		
	}
	
	/**
	 * 
	 * @Title: showTip  
	 * @Description: ���û���Ҫ������ʾ,�����û��б�ͨ���˻����ҵ���Ӧ�û�
	 * ��ͨ���û�����������ʾ  
	 * @param @param acc    ����  
	 * @return void    ��������  
	 * @throws
	 */
	private void showTip(String acc) {
		for (User user : userList) {
			if(user.getUserAcc().equals(acc)) {
				System.out.println("������ʾΪ:"+user.getUserPwdTip());
				break;
			}
		}
	}
	
	/**
	 * 
	 * @Title: currentUser  
	 * @Description: ��¼�ɹ� �����û��б�ͨ���˻��ҵ��û�  
	 * @param acc    �˻���  
	 * @return User   �û����� 
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
