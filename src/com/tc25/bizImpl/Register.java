package com.tc25.bizImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.tc25.bean.User;
import com.tc25.biz.Regist;
import com.tc25.data.UserList;
import com.tc25.tools.InputTool;
/**
 * 
 * @ClassName: Register  
 * @Description: ʵ��ע��  
 * @author Administrator  
 * @date 2017��11��22��  
 *
 */
public class Register implements Regist {

	//��data����ȡ��Ҫʹ�õ����ݰ����û��б���˺������HashMap
	private UserList uL = UserList.getInstance();
	private ArrayList<User> userList = uL.getUserList();
	private HashMap<String,String> accMap = uL.getAccMap();
	
	//�������빤��,��������iT.xxx������Ϊxx.nextXxx(),���ҷ�װ����,�����Ѿ�ץ���쳣
	private InputTool iT = InputTool.getInstance();
	
	/*
	 * (�� Javadoc)  
	 * <p>Title: regist</p>  
	 * <p>Description: ʵ��ע�᷽��,�ֲ�����ñ��������������ע��,����û���Ϣ����data</p>    
	 * @see com.tc25.biz.Regist#regist()
	 */
	@Override
	public void regist() {
		
		//�˻����������Ǳ����,����������ֻ��������ķ���Ҫ��Ż᷵��,���Բ��ÿ��Ǳ��ֱ�Ӹ�ֵ
		String acc = registAcc();
		String pwd = registPwd();
		//������ʾ���ǳ���ѡ���Ե�,��Ҫ�͵���Ӧ����,ͬ������������Ҳ�Ƿ���Ҫ��ŷ���
		System.out.println("�Ƿ�Ҫ����������ʾ?(1Ϊ��,����Ϊ��)");
		String isNeedTip = iT.getString();
		String tip = "";
		if("1".equals(isNeedTip)) {
			tip = registTip();
		}
		System.out.println("�Ƿ�Ҫ�����û��ǳ�?(1Ϊ��,����Ϊ��,Ĭ��Ϊ�˻���)");
		String isNeedNick = iT.getString();
		String nick = "";
		//������ѡ�������ǳƾ����˻������ǳ�
		if("1".equals(isNeedNick)) {
			nick = registNick();
		}else {
			nick = acc;
		}
		System.out.println("��ȷ�������û���Ϣ");
		System.out.println("�˻���:"+acc+"\t����:"+pwd+"\t������ʾ:"+tip+"\t�û��ǳ�:"+nick);
		System.out.println("����1ȷ��ע��\t����Ϊȡ��ע��:");
		String confirmReg = iT.getString();
		//�û�ȷ��ע���,��User���캯�������ö���,����������֮ǰ������ȡ,id�����û��б���д���Զ�����id�ķ���
		//�˻�״̬Ĭ��trueΪ����
		//�����ö�������û�����,ͬʱ���˻������ֵ�Լ���HashMap
		if("1".equals(confirmReg)) {
			System.out.println("ע��ɹ�!");
			userList.add(new User(uL.idCreate(),nick,acc,pwd,tip,true));
			accMap.put(acc, pwd);
		}else {
			System.out.println("��ȡ��ע��!");
			
		}
		/*String acc;
		String pwd;
		String tip;
		String nick;
		boolean isContinue = true;
		int index = 1;
		while(isContinue) {
			switch(index) {
			case 1:
				acc = registAcc();
				isContinue = isContinue();
				index = 2;
				break;
			case 2:
				pwd = registPwd();
				isContinue = isContinue();
				index = 3;
				break;
			case 3:
				System.out.println("�Ƿ�Ҫ����������ʾ?(1Ϊ��,����Ϊ��)");
				String isNeedTip = iT.getString();
				tip = "";
				if("1".equals(isNeedTip)) {
					tip = registTip();
				}
				isContinue = isContinue();
				index = 4;
				break;
			case 4:
				System.out.println("�Ƿ�Ҫ�����û��ǳ�?(1Ϊ��,����Ϊ��,Ĭ��Ϊ�˻���)");
				String isNeedNick = iT.getString();
				nick = "";
				if("1".equals(isNeedNick)) {
					nick = registNick();
				}else {
					nick = acc;
				}
				isContinue = isContinue();
				index = 5;
				break;
			default:
				break;
			
			}
		}*/
		
		
	}
	/**
	 * 
	 * @Title: registNick  
	 * @Description: ע������е��û��ǳƲ���    
	 * @return String    �û��ǳ�  
	 */
	private String registNick() {
		System.out.println("�������ǳ�:");
		String nick = "";
		
		while(true) {
			nick = iT.getString();
			//��߾�ֱ���жϳ����ǲ��Ƿ��Ͼ���
			if(nick.length()>=3 && nick.length()<=16) {
				System.out.println("���óɹ�!");
				break;
			}else{
				System.out.println("�ǳƸ�ʽ����ȷ,����������:");
				continue;
			}
		}
		return nick;
	}

	/**
	 * 
	 * @Title: registTip  
	 * @Description: ע������е�������ʾ����  
	 * @return String    ������ʾ  
	 */
	private String registTip() {
		System.out.println("������������ʾ:");
		String tip = "";
		
		while(true) {
			tip = iT.getString();
			//��߾�ֱ���жϳ����ǲ��Ƿ��Ͼ���
			if(tip.length()<=16) {
				System.out.println("���óɹ�!");
				break;
			}else{
				System.out.println("������ʾ��ʽ����ȷ,����������:");
				continue;
			}
		}
		return tip;
	}

	/**
	 * 
	 * @Title: registAcc  
	 * @Description: ע������е��˻�������  
	 * @return String    �˻���  
	 */
	private String registAcc() {
		System.out.println("������Ҫ�������˻���:");
		String acc = "";
		//��ʦд��������ʽ,�����ַ����ĸ�ʽҪ��
		Pattern p = Pattern.compile("^[a-zA-Z]{1}[a-zA-Z0-9_.]{5,15}");
		Matcher m = null;
		
		while(true) {
			//�������빤�ߵ�getString����,���û������˻���
			acc = iT.getString();
			//��m��ؾ����ж��ǲ��Ƿ���֮ǰ��������ʽ
			m = p.matcher(acc);
			//����������ʽҲ���Ǹ�ʽ��ȷ,�������˻���HashMap�в����ڴ��˻�
			//�������˻�����ע��,��Ȼ�����whileѭ���������û�����
			if(m.matches() && !(accMap.containsKey(acc))) {
				break;
			}else if(!m.matches()) {
				System.out.println("�˻�����ʽ����ȷ,����������:");
				continue;
			}else if(accMap.containsKey(acc)) {
				System.out.println("�˻����Ѵ���,����������:");
				continue;
			}
		}
		return acc;
	}
	
	/**
	 * 
	 * @Title: registPwd  
	 * @Description: ע������е����벿��  
	 * @return String    ����  
	 */
	private String registPwd() {
		System.out.println("����������:");
		String pwd ="";
		String pwd2 = "";
		Pattern p = Pattern.compile("[a-zA-Z0-9_.*]{6,16}");
		Matcher m = null;
		//���ϸ�����һ��,ֻ�ǲ����ж��Ƿ��Ѵ��ڸ�����,����һ��Ҫȷ��һ������,������������Ƚ�һ���Ƿ���ͬ
		while(true) {
			pwd = iT.getString();
			m = p.matcher(pwd);
			if(m.matches()) {
				
			}else{
				System.out.println("�����ʽ����ȷ,����������:");
				continue;
			}
			System.out.println("��ȷ������:");
			pwd2 = iT.getString();
			if(pwd.equals(pwd2)) {
				break;
			}else {
				System.out.println("ǰ�����벻һ��,��������������:");
				continue;
			}	
		}	
		return pwd;
	}
	
	private boolean isContinue() {
		System.out.println("����1������һ��,�������˳�ע��:");
		String isContinue = iT.getString();
		if("1".equals(isContinue)){
			return true;
		}else {
			return false;
		}
	}
	
	
	
	

}
