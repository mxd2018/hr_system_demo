package com.hr.mxd.service;

import java.util.List;

import com.hr.mxd.pojo.po.Employee;
import com.hr.mxd.pojo.po.PageBean;

public interface IEmployeeService {
		//���Ա��
		public void addEmployee(Employee employee);
		//ɾ��Ա��
		public void deleteEmployee(String eid);
		//�޸�Ա����Ϣ
		public void updateEmployee(Employee employee);
		//����Ա��������ѯ����Ա��
		public Employee selectEmployeeByName(Employee employee);
		//����Ա��id��ѯ����Ա��
		public Employee selectEmployeeById(String eid);
		//��ѯ����Ա����Ϣ
		public List<Employee> selectAllEmployee();
		//��ҳ��ѯ����Ա��
		public List<Employee> selectEmployeeByPage(PageBean pageBean);
		//��ѯԱ������
		public int selectToltalNumber();
		//���������߼���ѯ����������Ա��
		public List<Employee> findEmployeeByCondition(PageBean em_pageBean, Employee employee);
		//��ѯ����߼�����������Ա������
		public int findTotalNumberByCondition(Employee employee);
}
