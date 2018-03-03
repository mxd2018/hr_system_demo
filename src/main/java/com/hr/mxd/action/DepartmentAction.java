package com.hr.mxd.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hr.mxd.pojo.po.Departments;
import com.hr.mxd.pojo.po.PageBean;
import com.hr.mxd.service.IDepartmentService;



@Controller
@RequestMapping("/department")
public class DepartmentAction {
	@Autowired
	private IDepartmentService dservice;
	
	@RequestMapping("/listdepartment")
	public String listDepartment(@RequestParam(defaultValue="1")int currentpage,HttpSession session){
		int pagesize = 2;
		int totalnumber = dservice.selectTotalNumber();
		int totalpage = (int) Math.ceil(totalnumber/(pagesize*1.0));
		int productindex = (currentpage-1)*pagesize;
		
		PageBean pageBean = new PageBean(currentpage, pagesize, totalnumber, totalpage, productindex);
		session.setAttribute("pageBean", pageBean);
		
		List<Departments> departmentsByPage = dservice.selectDepartmentsByPage(pageBean);
		session.setAttribute("departments", departmentsByPage);
		
		return "departments";
	}
	
	@RequestMapping("/toAddDepartment")
	public String toAddDepartmentAction(){
		
		return "adddepartment";
	}
	
	@RequestMapping("/addDepartment")
	public String addDepartmentAction(Departments department){
		dservice.addDepartment(department);
		return "redirect:/department/listdepartment";
	}
	
	@RequestMapping("/deleteDepartment")
	public String deleteDepartmentAction(int did){
		dservice.deleteDepartment(did);
		return "redirect:/department/listdepartment";
	}
	
	@RequestMapping("/toUpdateDepartment")
	public String toUpdateDepartmentAction(int did,HttpServletRequest request){
		Departments departmentById = dservice.selectDepartmentById(did);
		request.setAttribute("departmentById", departmentById);
		return "updateDepartment";
	}
	
	@RequestMapping("/updateDepartment")
	public String updateDepartmentAction(Departments department){
		dservice.updateDepartment(department);
		return "redirect:/department/listdepartment";
	}
}
