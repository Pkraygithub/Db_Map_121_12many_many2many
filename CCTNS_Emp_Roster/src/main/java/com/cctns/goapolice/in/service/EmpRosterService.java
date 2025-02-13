package com.cctns.goapolice.in.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cctns.goapolice.in.exception.EmpRecodsNotFoundException;
import com.cctns.goapolice.in.model.ApplyLeave;
import com.cctns.goapolice.in.model.EmpRosterModel;
import com.cctns.goapolice.in.repo.ApplyLeaveRepo;
import com.cctns.goapolice.in.repo.EmpRosterRepositery;

@Service
public class EmpRosterService implements EmpRosterServiceImpl {

	@Autowired
	private EmpRosterRepositery repo;

	@Autowired
	private ApplyLeaveRepo leaveRepo;

	@Override
	public Integer saveEmpDetails(EmpRosterModel empr) {

		return repo.save(empr).getEId();

	}

	@Override
	public List<EmpRosterModel> getAllEmpDetails() {
		return repo.findAll();
	}

	@Override
	public EmpRosterModel getOneByEmployesId(Integer id) {

		Optional<EmpRosterModel> opt = repo.findById(id);

		EmpRosterModel empOne = null;
		if (opt.isPresent()) {
			empOne = opt.get();
		} else {
			throw new EmpRecodsNotFoundException("Employee not found for id :: " + id);
		}

		return empOne;
	}

	@Override
	public void deleteByEmployesId(Integer id) {
		repo.deleteById(id);

	}

	@Override
	public void updateByEmployesId(EmpRosterModel id) {
		repo.save(id);

	}

	@Override
	public String saveEmpRoseterDetails(EmpRosterModel empr) {
		return repo.save(empr).getEName();
	}

	@Override
	public List<EmpRosterModel> getAllByeName() {

		return repo.getAllByeName();
	}

	@Override
	public Integer applyLeaveSave(ApplyLeave applyLeave) {
		return leaveRepo.save(applyLeave).getLeaveid();
	}

	@Override
	public List<ApplyLeave> getAllEmpDetail() {
		return leaveRepo.findAll();
	}

	@Override
	public Page<EmpRosterModel> getAllEmpDetails(Pageable pageable) {
		Page<EmpRosterModel> page = repo.findAll(pageable);

		return page;

	}

	@Override
	public Page<ApplyLeave> getAllEmpDetail(Pageable pageable) {
		Page<ApplyLeave> page = leaveRepo.findAll(pageable);
		return page;
	}

	@Override
	public void deleteByLeaveId(Integer id) {

		leaveRepo.deleteById(id);
	}

}
