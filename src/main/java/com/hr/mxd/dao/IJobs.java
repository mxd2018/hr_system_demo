package com.hr.mxd.dao;

import java.util.List;

import com.hr.mxd.pojo.po.Jobs;
import com.hr.mxd.pojo.po.PageBean;

public interface IJobs {
	//添加一个职务
	public void addJob(Jobs job);
	//根据Id删除一个职务
	public void deleteJobById(int jid);
	//修改职务
	public void updateJob(Jobs job);
	//分页查询所有职务
	public List<Jobs> selectJobByPage(PageBean pageBean);
	//根据查询单个职务
	public Jobs selectJobById(int jid);
	//查询所有职务
	public List<Jobs> selectAllJob();
	//查询职务总数
	public int selectTotalNumber();
	

}
