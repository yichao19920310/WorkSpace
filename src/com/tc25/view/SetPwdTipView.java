/**  
 * @Title: SetPwdTipView.java  
 * @Package com.tc25.view  
 * @Description: TODO(��һ�仰�������ļ���ʲô)  
 * @author Administrator  
 * @date 2017��11��29��  
 * @version V1.0  
 */  
package com.tc25.view;

import com.tc25.data.UserList;

/**  
 * @ClassName: SetPwdTipView  
 * @Description: TODO(������һ�仰��������������)  
 * @author Administrator  
 * @date 2017��11��29��  
 *    
 */
public class SetPwdTipView extends View {

	/* (�� Javadoc)  
	 * <p>Title: showView</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.view.View#showView()  
	 */
	@Override
	public View showView() {
		System.out.println("=====>����������ʾ");
		System.out.println("������ԭ����");
		String pwd = iT.getString();
		if(pwd.equals(user.getUserPwd())) {
			System.out.println("��������������ʾ");
			String newPwdTip = iT.getString();			
			user.setUserPwdTip(newPwdTip);			
			System.out.println("������ʾ���óɹ�!");
			
		}else {
			System.out.println("�������!");
		}
		mView = new UserMenuView();			
		return mView;
	}

}
