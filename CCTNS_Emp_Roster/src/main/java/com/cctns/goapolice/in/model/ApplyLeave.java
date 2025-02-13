package com.cctns.goapolice.in.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Table(name="Apply_Leave_Details")
@Entity

public class ApplyLeave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Leave_Id")
	private Integer leaveid; 
	
	
	@Column(name="Name")
	private String ename ;
	
	
	@Column(name="Designation")
	private String edesignation ;
	
	@Column(name="From_Date")
	private String fromDate;
	
	@Column(name="To_Date")
	private String toDate;
	
	
	@Column(name="No_of_Days")
	private String noOfDays;
	
	@Column(name="Leave_Category")
	private String leaveCategory;
	
	@Column(name="Leave_Reason")
	private String LeaveReason;
	

	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<EmpRosterModel> empRosterModel=new ArrayList<EmpRosterModel>();
	
}