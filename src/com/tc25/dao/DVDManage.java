/**  
 * @Title: DVDManage.java  
 * @Package com.tc25.dao  
 * @Description: TODO(��һ�仰�������ļ���ʲô)  
 * @author Administrator  
 * @date 2017��11��22��  
 * @version V1.0  
 */  
package com.tc25.dao;

import com.tc25.bean.DVD;

/**  
 * @ClassName: DVDManage  
 * @Description: TODO(������һ�仰��������������)  
 * @author Administrator  
 * @date 2017��11��22��  
 *    
 */
public interface DVDManage {

	public DVD addDvd(String name);
	
	public DVD subDvdById(int id);
	
	public DVD subDvdByName(String name);
		
	public void showAllDvd();
	
	
	public void showAllOnlineDvd();
	
	public void showDvdByName(String name);

	/**  
	 * @Title: showDvdById  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @param id
	 * @param @return    ����  
	 * @return DVD    ��������  
	 * @throws  
	 */  
	public DVD showDvdById(int id);

	/**  
	 * @Title: changeDvdName  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @param id
	 * @param @return    ����  
	 * @return DVD    ��������  
	 * @throws  
	 */  
	public DVD changeDvdName(int id);
	
}
