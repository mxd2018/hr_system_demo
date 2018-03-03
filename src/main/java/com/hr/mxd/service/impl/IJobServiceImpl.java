package com.hr.mxd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mxd.dao.IJobs;
import com.hr.mxd.pojo.po.Jobs;
import com.hr.mxd.pojo.po.PageBean;
import com.hr.mxd.service.IJobService;

@Service
public class IJobServiceImpl implements IJobService{
	@Autowired
	private IJobs jdao;
	
	@Override
	public void addJob(Jobs job) {
		jdao.addJob(job);
		
	}

	@Override
	public void deleteJobById(int jid) {
		jdao.deleteJobById(jid);
		
	}

	@Override
	public void updateJob(Jobs job) {
		jdao.updateJob(job);
		
	}

	@Override
	public List<Jobs> selectJobByPage(PageBean pageBean) {
		return jdao.selectJobByPage(pageBean);
		
	}

	@Override
	public Jobs selectJobById(int jid) {
		
		return jdao.selectJobById(jid);
	}

	@Override
	public List<Jobs> selectAllJob() {
		// TODO Auto-generated method stub
		return jdao.selectAllJob();
	}

	@Override
	public int selectTotalNumber() {
		// TODO Auto-generated method stub
		return jdao.selectTotalNumber();
	}

}
