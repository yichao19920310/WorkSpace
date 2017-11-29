/**  
 * @Title: DVDManager.java  
 * @Package com.tc25.daoImpl  
 * @Description: TODO(��һ�仰�������ļ���ʲô)  
 * @author Administrator  
 * @date 2017��11��22��  
 * @version V1.0  
 */  
package com.tc25.daoImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

import com.tc25.bean.DVD;
import com.tc25.dao.DVDManage;
import com.tc25.data.DVDList;
import com.tc25.tools.InputTool;

/**  
 * @ClassName: DVDManager  
 * @Description: TODO(������һ�仰��������������)  
 * @author Administrator  
 * @date 2017��11��22��  
 *    
 */
public class DVDManager implements DVDManage {

	private InputTool iT = InputTool.getInstance();
	private DVDList list = DVDList.getInstance();
	private ArrayList<Integer> idList = list.getIdList();
	private ArrayList<DVD> dvdList = list.getDvdList();
	
	/* (�� Javadoc)  
	 * <p>Title: addDvd</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.dao.DVDManage#addDvd()  
	 */  
	@Override
	public DVD addDvd(String name) {
		System.out.println("ȷ���������Ϊ:\t"+name+"��DVD��?(1Ϊ��,����Ϊ��)");
		int isConfirm = iT.getInt();
		if(isConfirm == 1) {
			Date now = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			df.format(now);
			DVD dvd = new DVD(list.idCreate(),name,0,now,1);
			dvdList.add(dvd);
			System.out.println("��ӳɹ�!");
			return dvd;
		}
		return null;
	}

	/* (�� Javadoc)  
	 * <p>Title: subDvdById</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.dao.DVDManage#subDvdById()  
	 */  
	@Override
	public DVD subDvdById(int id) {
		DVD dvd = null;
		for (DVD d : dvdList) {
			if(id == d.getDvdId() && d.isDvdStatus() != 3) {
				
				System.out.println(dvd.toString());
				System.out.println("ȷ��Ҫɾ����DVD��?(1Ϊ��,����Ϊ��)");
				int isConfirm = iT.getInt();
				if(isConfirm == 1) {
					d.setDvdStatus(3);;
					dvd = d;
					System.out.println("ɾ���ɹ�!");
					return dvd;
				}
				return null;
			}
		}
		System.out.println("δ�ҵ�idΪ"+id+"��DVD");	
		return null;
	}

	/* (�� Javadoc)  
	 * <p>Title: subDvdByName</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.dao.DVDManage#subDvdByName()  
	 */  
	@Override
	public DVD subDvdByName(String name) {
		DVD dvd = null;
		for (DVD d : dvdList) {
			if(name == d.getDvdName() && d.isDvdStatus() != 3) {
				System.out.println(d.toString());
				System.out.println("ȷ��Ҫɾ����DVD��?(1Ϊ��,����Ϊ��)");
				int isConfirm = iT.getInt();
				if(isConfirm == 1) {
					
					d.setDvdStatus(3);
					dvd = d;
					System.out.println("ɾ���ɹ�!");
					return dvd;
				}
			}
		}
		System.out.println("δ�ҵ�����Ϊ"+name+"��DVD");
		return null;
	}

	/* (�� Javadoc)  
	 * <p>Title: changeDvdName</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.dao.DVDManage#changeDvdName()  
	 */  
	@Override
	public DVD changeDvdName(int id) {
		for (DVD d : dvdList) {
			if(id == d.getDvdId() && d.isDvdStatus() == 1){
				System.out.println(d.toString());
				System.out.println("��������ĺ������:");
				String name = iT.getString();
				System.out.println("ȷ��Ҫ����DVD���ƴ�\t"+d.getDvdName()+"\t����Ϊ"+name+"\t��?(1Ϊ��,����Ϊ��)");
				int isConfirm = iT.getInt();
				if(isConfirm == 1) {
					d.setDvdName(name);
					System.out.println("���ĳɹ�!");
					return d;
				}
				return null;
			}
		}
		System.out.println("δ�ҵ�idΪ"+ id +"��DVD!");
		return null;
	}

	/* (�� Javadoc)  
	 * <p>Title: showAllDvd</p>  
	 * <p>Description: </p>    
	 * @see com.tc25.dao.DVDManage#showAllDvd()  
	 */  
	@Override
	public void showAllDvd() {
		for (DVD dvd : dvdList) {
			if(dvd.isDvdStatus() != 3) {
				System.out.println(dvd.toString());
			}
		}
		
	}

	/* (�� Javadoc)  
	 * <p>Title: showDvdById</p>  
	 * <p>Description: </p>  
	 * @return  
	 * @see com.tc25.dao.DVDManage#showDvdById()  
	 */  
	@Override
	public DVD showDvdById(int id) {
		DVD dvd = null;
		for (DVD d : dvdList) {
			if(id == d.getDvdId()) {
				dvd = d;				
				System.out.println(dvd.toString());
				return dvd;
			}
		}
		
		return null;
	}

	/* (�� Javadoc)  
	 * <p>Title: showAllOnlineDvd</p>  
	 * <p>Description: </p>    
	 * @see com.tc25.dao.DVDManage#showAllOnlineDvd()  
	 */  
	@Override
	public void showAllOnlineDvd() {
		for (DVD dvd : dvdList) {
			if(dvd.isDvdStatus() == 1) {
				System.out.println(dvd.toString());
			}
		}
		
	}

	/* (�� Javadoc)  
	 * <p>Title: showDvdByName</p>  
	 * <p>Description: </p>    
	 * @see com.tc25.dao.DVDManage#showDvdByName()  
	 */  
	@Override
	public void showDvdByName(String name) {		
		int count = 0;
		for (DVD d : dvdList) {
			if(name == d.getDvdName()) {												
				System.out.println(d.toString());
				count++;
			}
		}
		if(count == 0) {
			System.out.println("δ�ҵ�����Ϊ"+ name +"��DVD!");
		}		
	}
	
	public void showDvdRank() {
		dvdList.sort(new Comparator<DVD>(){

			@Override
			public int compare(DVD o1, DVD o2) {
				
				return -(o1.getDvdLendCount()-o2.getDvdLendCount());
			}
			
		});
		int rank = 0;
		for (DVD dvd : dvdList) {
			System.out.print("����"+ ++rank +":");
			System.out.println(dvd.toString());
		}
	}

	
}
