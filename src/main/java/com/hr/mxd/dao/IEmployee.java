package com.hr.mxd.dao;

import java.util.List;
import java.util.Map;

import com.hr.mxd.pojo.po.Employee;
import com.hr.mxd.pojo.po.PageBean;

public interface IEmployee {
	//添加员工
	public void addEmployee(Employee employee);
	//删除员工
	public void deleteEmployee(String eid);
	//修改员工信息
	public void updateEmployee(Employee employee);
	//根据员工姓名查询单个员工
	public Employee selectEmployeeByName(Employee employee);
	//根据员工id查询单个员工
	public Employee selectEmployeeById(String eid);
	//查询所有员工信息
	public List<Employee> selectAllEmployee();
	//分页查询所有员工
	public List<Employee> selectEmployeeByPage(PageBean pageBean);
	//查询员工总数
	public int selectToltalNumber();
	//根据条件高级查询符合条件的员工
	public List<Employee> findEmployeeByCondition(Map<String,Object> map);
	//查询满足高级条件的所有员工数量
	public int findTotalNumberByCondition(Employee employee);
	
	
}
