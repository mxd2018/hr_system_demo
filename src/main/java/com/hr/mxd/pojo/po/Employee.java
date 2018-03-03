package com.hr.mxd.pojo.po;

import java.sql.Date;

public class Employee {
	/**
	 * `eid` varchar(50) NOT NULL,
  `ename` varchar(50) DEFAULT NULL,
  password
  `entrytime` date DEFAULT NULL,
  `department` int(11) DEFAULT NULL,
  `job` int(11) DEFAULT NULL,
	 */
	private String eid;
	private String ename;
	private String password;
	private int gender;
	private Date entrytime;
	private int department;
	private int job;
	private Jobs em_job;
	
	
	
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public Date getEntrytime() {
		return entrytime;
	}
	public void setEntrytime(Date entrytime) {
		this.entrytime = entrytime;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getJob() {
		return job;
	}
	public void setJob(int job) {
		this.job = job;
	}
	public Jobs getEm_job() {
		return em_job;
	}
	public void setEm_job(Jobs em_job) {
		this.em_job = em_job;
	}
	
	
}
