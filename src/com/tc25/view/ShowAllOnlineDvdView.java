/**  
 * @Title: ShowAllOnlineDvdView.java  
 * @Package com.tc25.view  
 * @Description: TODO(��һ�仰�������ļ���ʲô)  
 * @author Administrator  
 * @date 2017��11��29��  
 * @version V1.0  
 */  
package com.tc25.view;

import com.tc25.daoImpl.DVDManager;

/**  
 * @ClassName: ShowAllOnlineDvdView  
 * @Description: TODO(������һ�仰��������������)  
 * @author Administrator  
 * @date 2017��11��29��  
 *    
 */
public class ShowAllOnlineDvdView extends View {

	/* (�� Javadoc)  
	 * <p>Title: showView</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.view.View#showView()  
	 */
	@Override
	public View showView() {
		System.out.println("=====>�鿴�ɽ�DVD");
		DVDManager dvdM = new DVDManager();
		dvdM.showAllOnlineDvd();
		mView = new UserMenuView();
		return mView;
	}

}
