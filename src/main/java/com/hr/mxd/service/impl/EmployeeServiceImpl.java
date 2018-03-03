package com.hr.mxd.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.mxd.dao.IEmployee;
import com.hr.mxd.pojo.po.Employee;
import com.hr.mxd.pojo.po.PageBean;
import com.hr.mxd.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	private IEmployee edao;
	@Override
	public Employee selectEmployeeByName(Employee employee) {
		
		return edao.selectEmployeeByName(employee);
	}
	
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		edao.addEmployee(employee);
	}
	@Override
	public void deleteEmployee(String eid) {
		// TODO Auto-generated method stub
		edao.deleteEmployee(eid);
	}
	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		edao.updateEmployee(employee);
	}
	@Override
	public Employee selectEmployeeById(String eid) {
		// TODO Auto-generated method stub
		return edao.selectEmployeeById(eid);
	}
	@Override
	public List<Employee> selectAllEmployee() {
		// TODO Auto-generated method stub
		return edao.selectAllEmployee();
	}
	@Override
	public List<Employee> selectEmployeeByPage(PageBean pageBean) {
		// TODO Auto-generated method stub
		return edao.selectEmployeeByPage(pageBean);
	}
	@Override
	public int selectToltalNumber() {
		// TODO Auto-generated method stub
		return edao.selectToltalNumber();
	}

	@Override
	public List<Employee> findEmployeeByCondition(PageBean em_pageBean, Employee employee) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		Integer productindex = em_pageBean.getProductindex();
		Integer pagesize = em_pageBean.getPagesize();
		int department = employee.getDepartment();
		int job = employee.getJob();
		String ename = employee.getEname();
		
		map.put("productindex", productindex);
		map.put("pagesize", pagesize);
		map.put("department", department);
		map.put("job", job);
		map.put("ename", ename);
		
		return edao.findEmployeeByCondition(map);
	}

	@Override
	public int findTotalNumberByCondition(Employee employee) {
	
		return edao.findTotalNumberByCondition(employee);
	}

}
