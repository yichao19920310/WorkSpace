package com.tc25.data;

import java.util.ArrayList;

import com.tc25.bean.DVD;

public class DVDList {

	private static DVDList instance;
	private ArrayList<DVD> dvdList = new ArrayList<>();
	private ArrayList<Integer> idList = new ArrayList<>();
	
	public ArrayList<DVD> getDvdList() {
		return dvdList;
	}
	public void setDvdList(ArrayList<DVD> dvdList) {
		this.dvdList = dvdList;
	}
	public ArrayList<Integer> getIdList() {
		return idList;
	}
	public void setIdList(ArrayList<Integer> idList) {
		this.idList = idList;
	}
	public int idCreate() {
		idList.add(idList.size()+1);
		return idList.size();
	}
	private DVDList() {
		init();
	}
	
	public void init() {
		dvdList.add(new DVD(idCreate(),"Ƥ����",0,null,1));
		dvdList.add(new DVD(idCreate(),"������",0,null,1));
		dvdList.add(new DVD(idCreate(),"��Ӱ",0,null,1));
		dvdList.add(new DVD(idCreate(),"���뱦��",0,null,1));
		dvdList.add(new DVD(idCreate(),"�ǹ���",0,null,1));
		dvdList.add(new DVD(idCreate(),"������",0,null,1));
		dvdList.add(new DVD(idCreate(),"������",0,null,1));
		dvdList.add(new DVD(idCreate(),"����Ůսʿ",0,null,1));
		dvdList.add(new DVD(idCreate(),"���������",0,null,1));
		dvdList.add(new DVD(idCreate(),"�������",0,null,1));
		
	}

	/**  
	 * @Title: getInstance  
	 * @Description: TODO(������һ�仰�����������������)  
	 * @param @return    ����  
	 * @return DVDList    ��������  
	 * @throws  
	 */  
	public static DVDList getInstance() {
		if(instance == null) {
			instance = new DVDList();
		}
		return instance;
	}
}
