package com.hr.mxd.dao;

import java.util.List;

import com.hr.mxd.pojo.po.Jobs;
import com.hr.mxd.pojo.po.PageBean;

public interface IJobs {
	//���һ��ְ��
	public void addJob(Jobs job);
	//����Idɾ��һ��ְ��
	public void deleteJobById(int jid);
	//�޸�ְ��
	public void updateJob(Jobs job);
	//��ҳ��ѯ����ְ��
	public List<Jobs> selectJobByPage(PageBean pageBean);
	//���ݲ�ѯ����ְ��
	public Jobs selectJobById(int jid);
	//��ѯ����ְ��
	public List<Jobs> selectAllJob();
	//��ѯְ������
	public int selectTotalNumber();
	

}
