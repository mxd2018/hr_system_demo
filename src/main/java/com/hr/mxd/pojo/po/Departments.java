package com.hr.mxd.pojo.po;

public class Departments {
	/**
	 * `did` int(11) NOT NULL AUTO_INCREMENT,
  `dname` varchar(50) DEFAULT NULL,
	 */
	
	private int did;
	private String dname;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	
}
