/**  
 * @Title: SetPwdTipView.java  
 * @Package com.tc25.view  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author Administrator  
 * @date 2017年11月29日  
 * @version V1.0  
 */  
package com.tc25.view;

import com.tc25.data.UserList;

/**  
 * @ClassName: SetPwdTipView  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author Administrator  
 * @date 2017年11月29日  
 *    
 */
public class SetPwdTipView extends View {

	/* (非 Javadoc)  
	 * <p>Title: showView</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.view.View#showView()  
	 */
	@Override
	public View showView() {
		System.out.println("=====>设置密码提示");
		System.out.println("请输入原密码");
		String pwd = iT.getString();
		if(pwd.equals(user.getUserPwd())) {
			System.out.println("请输入新密码提示");
			String newPwdTip = iT.getString();			
			user.setUserPwdTip(newPwdTip);			
			System.out.println("密码提示设置成功!");
			
		}else {
			System.out.println("密码错误!");
		}
		mView = new UserMenuView();			
		return mView;
	}

}
