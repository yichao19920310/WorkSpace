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

	public DVD addDvd(String name);
	
	public DVD subDvdById(int id);
	
	public DVD subDvdByName(String name);
		
	public void showAllDvd();
	
	
	public void showAllOnlineDvd();
	
	public void showDvdByName(String name);

	/**  
	 * @Title: showDvdById  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param id
	 * @param @return    参数  
	 * @return DVD    返回类型  
	 * @throws  
	 */  
	public DVD showDvdById(int id);

	/**  
	 * @Title: changeDvdName  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @param id
	 * @param @return    参数  
	 * @return DVD    返回类型  
	 * @throws  
	 */  
	public DVD changeDvdName(int id);
	
}
