package com.hr.mxd.dao;

import java.util.List;

import com.hr.mxd.pojo.po.Departments;
import com.hr.mxd.pojo.po.PageBean;

public interface IDepartments {
	//��Ӳ���
	public void addDepartment(Departments department);
	//ɾ������
	public void deleteDepartment(int did);
	//�޸Ĳ�����Ϣ
	public void updateDepartment(Departments department);
	//��ҳ��ѯ���в�����Ϣ
	public List<Departments> selectDepartmentsByPage(PageBean pageBean);
	//��ѯ���в���
	public List<Departments> selectAllDepartments();
	//����id��ѯ������Ϣ
	public Departments selectDepartmentById(int id);
	
	//��ѯ�ܲ�����
	public int selectTotalNumber();
	
}
