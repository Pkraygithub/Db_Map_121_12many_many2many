package com.onetone.com.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EmpDetls")
public class Employees {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eid;
	private String ename;
	private String egender;
	private double esalary;
	private String edept;
	

	@OneToMany(mappedBy = "employees" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Address> addes;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employees(Integer eid, String ename, String egender, double esalary, String edept, List<Address> addes) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.egender = egender;
		this.esalary = esalary;
		this.edept = edept;
		this.addes = addes;
	}


	public Integer getEid() {
		return eid;
	}


	public void setEid(Integer eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEgender() {
		return egender;
	}


	public void setEgender(String egender) {
		this.egender = egender;
	}


	public double getEsalary() {
		return esalary;
	}


	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}


	public String getEdept() {
		return edept;
	}


	public void setEdept(String edept) {
		this.edept = edept;
	}


	public List<Address> getAddes() {
		return addes;
	}


	public void setAddes(List<Address> addes) {
		this.addes = addes;
	}
	
	
	
	
	
	
}
