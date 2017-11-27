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
		dvdList.add(new DVD(idCreate(),"皮卡丘",0,null,1));
		dvdList.add(new DVD(idCreate(),"奥特曼",0,null,1));
		dvdList.add(new DVD(idCreate(),"火影",0,null,1));
		dvdList.add(new DVD(idCreate(),"数码宝贝",0,null,1));
		dvdList.add(new DVD(idCreate(),"亚古兽",0,null,1));
		dvdList.add(new DVD(idCreate(),"鸡儿受",0,null,1));
		dvdList.add(new DVD(idCreate(),"海贼王",0,null,1));
		dvdList.add(new DVD(idCreate(),"美少女战士",0,null,1));
		dvdList.add(new DVD(idCreate(),"月礼服假面",0,null,1));
		dvdList.add(new DVD(idCreate(),"格里格里",0,null,1));
		
	}

	/**  
	 * @Title: getInstance  
	 * @Description: TODO(这里用一句话描述这个方法的作用)  
	 * @param @return    参数  
	 * @return DVDList    返回类型  
	 * @throws  
	 */  
	public static DVDList getInstance() {
		if(instance == null) {
			instance = new DVDList();
		}
		return instance;
	}
}
