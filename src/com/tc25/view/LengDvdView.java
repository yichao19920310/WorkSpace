/**  
 * @Title: LengDvdView.java  
 * @Package com.tc25.view  
 * @Description: TODO(��һ�仰�������ļ���ʲô)  
 * @author Administrator  
 * @date 2017��11��29��  
 * @version V1.0  
 */  
package com.tc25.view;

import com.tc25.bean.DVD;
import com.tc25.daoImpl.DVDManager;

/**  
 * @ClassName: LengDvdView  
 * @Description: TODO(������һ�仰��������������)  
 * @author Administrator  
 * @date 2017��11��29��  
 *    
 */
public class LengDvdView extends View {

	/* (�� Javadoc)  
	 * <p>Title: showView</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.view.View#showView()  
	 */
	@Override
	public View showView() {
		System.out.println("=====>���DVD");
		System.out.println("��ѡ��Ҫ�����DVDid:");
		int id = iT.getInt();
		DVDManager dvdM = new DVDManager();
		DVD dvd = dvdM.showDvdById(id);
		if (dvd == null) {
			System.out.println("δ�ҵ�idΪ"+id+"��DVD!");
			return mView = new UserMenuView();
		}
		dvd.setDvdLendCount(dvd.getDvdLendCount()+1);
		dvd.setDvdStatus(2);
		System.out.println("�ɹ����DVD:"+dvd.getDvdName());
		return mView = new UserMenuView();
	}

}
