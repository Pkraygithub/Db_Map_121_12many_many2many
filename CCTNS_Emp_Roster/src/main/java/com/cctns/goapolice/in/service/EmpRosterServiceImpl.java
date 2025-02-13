package com.cctns.goapolice.in.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cctns.goapolice.in.model.ApplyLeave;
import com.cctns.goapolice.in.model.EmpRosterModel;

public interface EmpRosterServiceImpl {

	public Integer saveEmpDetails(EmpRosterModel empr);

	List<EmpRosterModel> getAllEmpDetails();

	EmpRosterModel getOneByEmployesId(Integer id);

	// EmpRosterModel getOneByEmployesName(String eName);

	void updateByEmployesId(EmpRosterModel id);

	void deleteByEmployesId(Integer id);

	public String saveEmpRoseterDetails(EmpRosterModel empr);

	public List<EmpRosterModel>  getAllByeName();

	public Integer applyLeaveSave(ApplyLeave applyLeave);
	
	List<ApplyLeave> getAllEmpDetail();
	
	 
	 Page<EmpRosterModel> getAllEmpDetails(Pageable pageable);
	 
	 Page<ApplyLeave> getAllEmpDetail(Pageable pageable);
	
	 void deleteByLeaveId(Integer id);
}
