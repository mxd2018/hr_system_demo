package com.hr.mxd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hr.mxd.pojo.po.Departments;
import com.hr.mxd.pojo.po.PageBean;

public interface IDepartmentService {
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
		//根据查询单个部门信息
		public Departments selectDepartmentById(int did);
		//查询总部门数
		public int selectTotalNumber();
	
}
