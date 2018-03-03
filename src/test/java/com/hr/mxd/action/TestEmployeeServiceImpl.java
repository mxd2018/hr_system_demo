package com.hr.mxd.action;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hr.mxd.pojo.po.Employee;
import com.hr.mxd.pojo.po.PageBean;
import com.hr.mxd.service.impl.EmployeeServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-mvc.xml","classpath*:spring.xml","classpath*:mybatis.xml"})
public class TestEmployeeServiceImpl {
	@Autowired
	private EmployeeServiceImpl employService;
	
	@Test
	public void findEmployeeActionTest(){
		Employee employee = new Employee();
		employee.setDepartment(0);
		employee.setJob(0);
		employee.setEname("rrr");
		
		PageBean em_pageBean=new PageBean();
		em_pageBean.setProductindex(0);
		em_pageBean.setPagesize(2);
		
		List<Employee> findEmployeeByCondition = employService.findEmployeeByCondition(em_pageBean, employee);
		for(Employee e:findEmployeeByCondition){
			System.out.println(e.getEm_job().getDepartment().getDname());
		}
	}
}
