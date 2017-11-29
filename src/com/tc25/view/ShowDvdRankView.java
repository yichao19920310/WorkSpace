/**  
 * @Title: ShowDvdRankView.java  
 * @Package com.tc25.view  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author Administrator  
 * @date 2017年11月29日  
 * @version V1.0  
 */  
package com.tc25.view;

import com.tc25.daoImpl.DVDManager;

/**  
 * @ClassName: ShowDvdRankView  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author Administrator  
 * @date 2017年11月29日  
 *    
 */
public class ShowDvdRankView extends View {

	/* (非 Javadoc)  
	 * <p>Title: showView</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.view.View#showView()  
	 */
	@Override
	public View showView() {
		System.out.println("=====>DVD热度排行");
		DVDManager dvdM = new DVDManager();
		dvdM.showDvdRank();
		mView = new UserMenuView();
		return mView;
	}

}
