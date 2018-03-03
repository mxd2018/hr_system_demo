package com.hr.mxd.dao;

import java.util.List;

import com.hr.mxd.pojo.po.Departments;
import com.hr.mxd.pojo.po.PageBean;

public interface IDepartments {
	//添加部门
	public void addDepartment(Departments department);
	//删除部门
	public void deleteDepartment(int did);
	//修改部门信息
	public void updateDepartment(Departments department);
	//分页查询所有部门信息
	public List<Departments> selectDepartmentsByPage(PageBean pageBean);
	//查询所有部门
	public List<Departments> selectAllDepartments();
	//根据id查询部门信息
	public Departments selectDepartmentById(int id);
	
	//查询总部门数
	public int selectTotalNumber();
	
}
