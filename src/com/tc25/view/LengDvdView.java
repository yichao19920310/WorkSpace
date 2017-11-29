/**  
 * @Title: LengDvdView.java  
 * @Package com.tc25.view  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author Administrator  
 * @date 2017年11月29日  
 * @version V1.0  
 */  
package com.tc25.view;

import com.tc25.bean.DVD;
import com.tc25.daoImpl.DVDManager;

/**  
 * @ClassName: LengDvdView  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author Administrator  
 * @date 2017年11月29日  
 *    
 */
public class LengDvdView extends View {

	/* (非 Javadoc)  
	 * <p>Title: showView</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.view.View#showView()  
	 */
	@Override
	public View showView() {
		System.out.println("=====>借出DVD");
		System.out.println("请选择要借出的DVDid:");
		int id = iT.getInt();
		DVDManager dvdM = new DVDManager();
		DVD dvd = dvdM.showDvdById(id);
		if (dvd == null) {
			System.out.println("未找到id为"+id+"的DVD!");
			return mView = new UserMenuView();
		}
		dvd.setDvdLendCount(dvd.getDvdLendCount()+1);
		dvd.setDvdStatus(2);
		System.out.println("成功借出DVD:"+dvd.getDvdName());
		return mView = new UserMenuView();
	}

}
