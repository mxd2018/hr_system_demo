package com.hr.mxd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mxd.dao.IDepartments;
import com.hr.mxd.pojo.po.Departments;
import com.hr.mxd.pojo.po.PageBean;
import com.hr.mxd.service.IDepartmentService;

@Service
public class DepartmentServiceImpl implements IDepartmentService{
	@Autowired
	private IDepartments ddao;
	
	@Override
	public void addDepartment(Departments department) {
		ddao.addDepartment(department);
		
	}

	@Override
	public void deleteDepartment(int did) {
		ddao.deleteDepartment(did);
		
	}

	@Override
	public void updateDepartment(Departments department) {
		ddao.updateDepartment(department);
		
	}

	@Override
	public List<Departments> selectDepartmentsByPage(PageBean pageBean) {
		
		return ddao.selectDepartmentsByPage(pageBean);
	}

	@Override
	public List<Departments> selectAllDepartments() {
		
		return ddao.selectAllDepartments();
	}
	
	@Override
	public Departments selectDepartmentById(int did) {
		
		return ddao.selectDepartmentById(did);
	}

	@Override
	public int selectTotalNumber() {
		
		return ddao.selectTotalNumber();
	}

	

}
