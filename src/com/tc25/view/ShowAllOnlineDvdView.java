/**  
 * @Title: ShowAllOnlineDvdView.java  
 * @Package com.tc25.view  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author Administrator  
 * @date 2017年11月29日  
 * @version V1.0  
 */  
package com.tc25.view;

import com.tc25.daoImpl.DVDManager;

/**  
 * @ClassName: ShowAllOnlineDvdView  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author Administrator  
 * @date 2017年11月29日  
 *    
 */
public class ShowAllOnlineDvdView extends View {

	/* (非 Javadoc)  
	 * <p>Title: showView</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.view.View#showView()  
	 */
	@Override
	public View showView() {
		System.out.println("=====>查看可借DVD");
		DVDManager dvdM = new DVDManager();
		dvdM.showAllOnlineDvd();
		mView = new UserMenuView();
		return mView;
	}

}
