package com.tc25.bean;

import java.util.Date;

public class LendRecord implements Comparable<LendRecord>{

	private int lrId;
	private String lrNumber;
	private int dvdId;
	private String dvdName;
	private Date lendDate;
	private Date retuDate;
	private int userId;
	private boolean lrStatus;
	
	@Override
	public int compareTo(LendRecord o) {
		// TODO Auto-generated method stub
		return this.getLendDate().compareTo(o.getLendDate());
	}

	public int getLrId() {
		return lrId;
	}

	public void setLrId(int lrId) {
		this.lrId = lrId;
	}

	public String getLrNumber() {
		return lrNumber;
	}

	public void setLrNumber(String lrNumber) {
		this.lrNumber = lrNumber;
	}

	public int getDvdId() {
		return dvdId;
	}

	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}

	public String getDvdName() {
		return dvdName;
	}

	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}

	public Date getLendDate() {
		return lendDate;
	}

	public void setLendDate(Date lendDate) {
		this.lendDate = lendDate;
	}

	public Date getRetuDate() {
		return retuDate;
	}

	public void setRetuDate(Date retuDate) {
		this.retuDate = retuDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public boolean isLrStatus() {
		return lrStatus;
	}

	public void setLrStatus(boolean lrStatus) {
		this.lrStatus = lrStatus;
	}

	public LendRecord(int lrId, String lrNumber, int dvdId, String dvdName, Date lendDate, Date retuDate, int userId,
			boolean lrStatus) {
		this(lrNumber,dvdId,dvdName,lendDate,retuDate,userId,lrStatus);
		this.lrId = lrId;
		
	}

	public LendRecord(String lrNumber, int dvdId, String dvdName, Date lendDate, Date retuDate, int userId,
			boolean lrStatus) {
		super();
		this.lrNumber = lrNumber;
		this.dvdId = dvdId;
		this.dvdName = dvdName;
		this.lendDate = lendDate;
		this.retuDate = retuDate;
		this.userId = userId;
		this.lrStatus = lrStatus;
	}

	public LendRecord() {
		super();
	}

	
	
}
