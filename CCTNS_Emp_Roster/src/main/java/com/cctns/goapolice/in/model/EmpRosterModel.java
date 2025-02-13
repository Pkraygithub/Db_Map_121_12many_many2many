package com.cctns.goapolice.in.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Emp_Roster")

public class EmpRosterModel {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="Emp_Id")
	private Integer eId;
	
	
	@Column(name="Employees_Name")
	private String eName;

	@Column(name="Constable No")
	private String constable_Id;
	
	
	@Column(name="Designation")
	private String edesignation;
	
	
//	private RosterEmpDetails rosterEmpDetails;
	
	/*
	 * @ManyToOne private ApplyLeave applyLeave;
	 */
}
