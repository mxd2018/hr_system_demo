package com.hr.mxd.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hr.mxd.dao.IDepartments;
import com.hr.mxd.pojo.po.Departments;
import com.hr.mxd.pojo.po.Jobs;
import com.hr.mxd.pojo.po.PageBean;
import com.hr.mxd.service.IJobService;

@Controller
@RequestMapping("/job")
public class JobAction {
	@Autowired
	private IJobService jService;
	@Autowired
	private IDepartments dService;
	
	@RequestMapping("/listjob")
	public String listJobAction(@RequestParam(defaultValue="1")int currentpage,HttpServletRequest request,HttpSession session){
		int pagesize = 2;
		int totalnumber = jService.selectTotalNumber();
		int totalpage = (int) Math.ceil(totalnumber/(pagesize*1.0));
		int productindex = (currentpage-1)*pagesize;
		
		PageBean pageBean = new PageBean(currentpage, pagesize, totalnumber, totalpage, productindex);
		session.setAttribute("job_pageBean", pageBean);
		
		List<Jobs> selectJobByPage = jService.selectJobByPage(pageBean);
		session.setAttribute("jobs", selectJobByPage);
		return "jobs";
	}
	
	
	@RequestMapping("/toAddJob")
	public String toAddJobAction(HttpSession session){
		List<Departments> SessionDepartments = dService.selectAllDepartments();
		session.setAttribute("SessionDepartments", SessionDepartments);
		return "addjob";
	}
	
	@RequestMapping("/addJob")
	public String addJobAction(Jobs job){
		jService.addJob(job);
		return "redirect:/job/listjob";
	}
	
	@RequestMapping("/deleteJob")
	public String deleteJobAction(int jid){
		jService.deleteJobById(jid);
		return "redirect:/job/listjob";
	}
	
	@RequestMapping("/toUpdateJob")
	public String toUpdateJobAction(int jid,HttpServletRequest request){
		Jobs selectJobById = jService.selectJobById(jid);
		request.setAttribute("selectJobById", selectJobById);
		return "updateJob";
	}
	
	@RequestMapping("/updateJob")
	public String updateJobAction(Jobs job){
		jService.updateJob(job);
		return "redirect:/job/listjob";
	}
	
}
