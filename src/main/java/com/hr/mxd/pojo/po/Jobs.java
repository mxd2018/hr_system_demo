package com.hr.mxd.pojo.po;

public class Jobs {
	/**
	 * `jid` int(11) NOT NULL AUTO_INCREMENT,
  `jname` varchar(50) DEFAULT NULL,
  `departmentid` int(11) DEFAULT NULL,
	 */
	
	private int jid;
	private String jname;
	private int departmentid;
	private Departments department;
	
	public int getJid() {
		return jid;
	}
	public void setJid(int jid) {
		this.jid = jid;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public Departments getDepartment() {
		return department;
	}
	public void setDepartment(Departments department) {
		this.department = department;
	}
	
	

	
}
