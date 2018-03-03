package com.hr.mxd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hr.mxd.pojo.po.Departments;
import com.hr.mxd.pojo.po.PageBean;

public interface IDepartmentService {
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
		//���ݲ�ѯ����������Ϣ
		public Departments selectDepartmentById(int did);
		//��ѯ�ܲ�����
		public int selectTotalNumber();
	
}
