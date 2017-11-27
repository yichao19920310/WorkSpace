/**  
 * @Title: DVDManage.java  
 * @Package com.tc25.dao  
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author Administrator  
 * @date 2017年11月22日  
 * @version V1.0  
 */  
package com.tc25.dao;

import com.tc25.bean.DVD;

/**  
 * @ClassName: DVDManage  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author Administrator  
 * @date 2017年11月22日  
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
