package com.hr.mxd.pojo.po;

public class PageBean {
	private Integer currentpage;
	private Integer pagesize;
	private Integer totalnumber;
	private Integer totalpage;
	private Integer productindex;
	
	
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageBean(Integer currentpage, Integer pagesize, Integer totalnumber, Integer totalpage,
			Integer productindex) {
		super();
		this.currentpage = currentpage;
		this.pagesize = pagesize;
		this.totalnumber = totalnumber;
		this.totalpage = totalpage;
		this.productindex = productindex;
	}
	public Integer getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(Integer currentpage) {
		this.currentpage = currentpage;
	}
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public Integer getTotalnumber() {
		return totalnumber;
	}
	public void setTotalnumber(Integer totalnumber) {
		this.totalnumber = totalnumber;
	}
	public Integer getTotalpage() {
		return totalpage;
	}
	public void setTotalpage(Integer totalpage) {
		this.totalpage = totalpage;
	}
	public Integer getProductindex() {
		return productindex;
	}
	public void setProductindex(Integer productindex) {
		this.productindex = productindex;
	} 
	
	
}
