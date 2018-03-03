package com.hr.mxd.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hr.mxd.pojo.po.Departments;
import com.hr.mxd.pojo.po.Employee;
import com.hr.mxd.pojo.po.Jobs;
import com.hr.mxd.pojo.po.PageBean;
import com.hr.mxd.service.IDepartmentService;
import com.hr.mxd.service.IEmployeeService;
import com.hr.mxd.service.IJobService;
import com.hr.mxd.tool.UUIDCreator;


@Controller
@RequestMapping("/employee")
public class EmployeeAction {
	@Autowired
	private IEmployeeService eService;
	@Autowired 
	private IDepartmentService dService;
	@Autowired
	private IJobService jService;
	
	@RequestMapping("/tologin")
	public String toLoginAction(){
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginAction(Employee employee,HttpSession session){
		Employee findEmployee = eService.selectEmployeeByName(employee);
		//System.out.println(findEmployee.getEname());
		if(findEmployee!=null){
			if(findEmployee.getPassword().equals(employee.getPassword())){
				session.setAttribute("sessionEmployee", findEmployee);
				return "redirect:/employee/toindex";
			}
		}	
		return "tologin";
	}
	
	@RequestMapping("/toindex")
	public String toIndexAction(){
		return "index";
	}
	
	@RequestMapping("/listemployee")
	public String ListEmployeeByPageAction(@RequestParam(defaultValue="1")int currentpage,HttpServletRequest request,HttpSession session){
		int pagesize = 2;
		int totalnumber = eService.selectToltalNumber();
		int totalpage = (int) Math.ceil(totalnumber/(pagesize*1.0));
		int productindex = (currentpage-1)*pagesize;
		
		PageBean pageBean = new PageBean(currentpage, pagesize, totalnumber, totalpage, productindex);
		session.setAttribute("em_pageBean", pageBean);
		
		List<Employee> selectEmployeeByPage = eService.selectEmployeeByPage(pageBean);
		session.setAttribute("employees", selectEmployeeByPage);
		
		List<Departments> SessionDepartments = dService.selectAllDepartments();
		session.setAttribute("SessionDepartments", SessionDepartments);
		
		List<Jobs> SessionJobs = jService.selectAllJob();
		session.setAttribute("SessionJobs", SessionJobs);
		
		return "employees";
	}
	
	@RequestMapping("/toAddEmployee")
	public String toAddEmployeeAction(HttpSession session){
		List<Departments> SessionDepartments = dService.selectAllDepartments();
		session.setAttribute("SessionDepartments", SessionDepartments);
		return "addemployee";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployeeAction(Employee employee){
		employee.setEid(UUIDCreator.createUUID());
		eService.addEmployee(employee);
		return "redirect:/employee/listemployee";
	}
	
	@RequestMapping("/deleteEmployee")
	public String deleteEmployeeAction(String eid){
		eService.deleteEmployee(eid);;
		return "redirect:/employee/listemployee";
	}
	
	@RequestMapping("/toUpdateEmployee")
	public String toUpdateEmployeeAction(String eid,HttpServletRequest request){
		Employee selectEmployeeById = eService.selectEmployeeById(eid);
		request.setAttribute("selectEmployeeById", selectEmployeeById);
		return "updateEmployee";
	}
	
	@RequestMapping("/updateEmployee")
	public String updateEmployeeAction(Employee employee){
		eService.updateEmployee(employee);;
		return "redirect:/employee/listemployee";
	}
	
	@RequestMapping("/findEmployee")
	public String findEmployeeAction(Employee employee,HttpSession session){
		PageBean em_pageBean = (PageBean) session.getAttribute("em_pageBean");
		
		em_pageBean.setCurrentpage(1);
		int findTotalNumberByCondition = eService.findTotalNumberByCondition(employee);
		em_pageBean.setTotalnumber(findTotalNumberByCondition);
		int totalpage = (int) Math.ceil(findTotalNumberByCondition/(em_pageBean.getPagesize()*1.0));
		em_pageBean.setTotalpage(findTotalNumberByCondition);
		
		session.setAttribute("em_pageBean", em_pageBean);
		
		List<Employee> employees = eService.findEmployeeByCondition(em_pageBean,employee);
		session.setAttribute("employees", employees);
		
		
		return "employees";
	}
}
