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

	public DVD addDvd();
	
	public DVD subDvdById();
	
	public DVD subDvdByName();
	
	public DVD changeDvdName();
	
	public void showAllDvd();
	
	public DVD showDvdById();
	
	public void showAllOnlineDvd();
	
	public void showDvdByName();
	
}
