package com.cctns.goapolice.in.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cctns.goapolice.in.model.ApplyLeave;
import com.cctns.goapolice.in.model.EmpRosterModel;
import com.cctns.goapolice.in.service.EmpRosterServiceImpl;

@Controller
@RequestMapping("/cctns")
public class EmpRosterController {

	@Autowired
	private EmpRosterServiceImpl service;

	@GetMapping("/reg")
	public String showEmpRoster(Model model) {
		model.addAttribute("empRosterModel", new EmpRosterModel());

		return "index";
	}

	@PostMapping("/roster")
	public String saveEmpDetails(@ModelAttribute EmpRosterModel empRosterModel, Model model) {

		Integer id = service.saveEmpDetails(empRosterModel);

		String msg = "Employees Id No- " + id + " is Added Successfully Into Database.";

		model.addAttribute("empMessage", msg);

		return "index";
	}

	@GetMapping("/showallrecords")
	public String showAllEmpRecords(@PageableDefault(page = 0, size = 10) Pageable p, Model model) {

		// List<EmpRosterModel> allrecords = service.getAllEmpDetails();
		Page<EmpRosterModel> page = service.getAllEmpDetails(p);
		model.addAttribute("list", page.getContent());
		model.addAttribute("page", page);

		return "Emp_Records";
	}

	@GetMapping("/deleteEmprecords/{id}")
	public String deleteEmpRecords(@PageableDefault(page = 0, size = 6) Pageable p, @PathVariable Integer id,
			Model model) {
		service.deleteByEmployesId(id);
		String delMsg = "Employes Id No - " + id + " Deleted Successfully";
		model.addAttribute("deleteMessage", delMsg);

		// show all emp_records code
		Page<EmpRosterModel> page = service.getAllEmpDetails(p);
		model.addAttribute("page", page);
		return "Emp_Records";
	}

	@GetMapping("/editrecords/{id}")
	public String editEmpRecords(@PathVariable Integer id, Model model) {
		EmpRosterModel update = service.getOneByEmployesId(id);
		model.addAttribute("eupdate", update);
		return "editRecords";
	}

	@PostMapping("/update")
	public String updateEmpRecords(@PageableDefault(page = 0, size = 6) Pageable p,
			@ModelAttribute EmpRosterModel empRosterModel, Model model) {

		service.updateByEmployesId(empRosterModel);
		String updateMessage = "Employees Id No " + empRosterModel.getEId() + "Update Successfully";
		model.addAttribute("updatemessage", updateMessage);

		// show all emp_records code
		Page<EmpRosterModel> page = service.getAllEmpDetails(p);
		model.addAttribute("page", page);
		return "Emp_Records";
	}

	@GetMapping("/rostersheet")
	public String showRosterDetails(@ModelAttribute EmpRosterModel empRosterModel, String eName, Integer eId,
			Model model) {

		empRosterModel = new EmpRosterModel();
		empRosterModel.setEId(eId);
		empRosterModel.setEName(eName);
		List<EmpRosterModel> rosterEmpList = service.getAllByeName();
		// System.out.println("List Of Employes Only "+rosterEmpList);
		model.addAttribute("RosterEmpList", rosterEmpList);
		return "roster";

	}

	@GetMapping("/rostersheetSave")
	public String saveRosterDetails(@ModelAttribute EmpRosterModel empRosterModel, Model model) {

		Integer id = service.saveEmpDetails(empRosterModel);
		String msgs = "Employees Id No- " + id + " is Added Successfully Into Database.";
		model.addAttribute("rosterMessage", msgs);
		return "roster";

	}

	// Leave Details Controller
	@GetMapping("/leavedetails")
	public String leaveAllDetails(@PageableDefault(page = 0, size = 8) Pageable p,
			@ModelAttribute EmpRosterModel empRosterModel, Integer eId, String eName, String edesignation,
			Model model) {

		empRosterModel = new EmpRosterModel();
		empRosterModel.setEId(eId);
		empRosterModel.setEName(eName);
		empRosterModel.setEdesignation(edesignation);

		/*
		 * List<EmpRosterModel> nemeDisg = service.getAllByeName();
		 * nemeDisg.forEach(e->{System.out.println(e);});
		 */

		Page<EmpRosterModel> page = service.getAllEmpDetails(p);
		model.addAttribute("page", page);
		return "leaveDetails";

	}

	@GetMapping("/leave")
	public String showLeaveEmpRoster(Model model) {
		model.addAttribute("leavempRosterModel", new ApplyLeave());

		return "appelyLeaveDetails";
	}

	@PostMapping("applyLeave")
	public String applyLeaves(@ModelAttribute ApplyLeave applyLeave, Model model) {

		Integer leaveid = service.applyLeaveSave(applyLeave);
		String lmsg = "Employees Id No- " + leaveid + " is Apply leave Successfully .";
		model.addAttribute("leavempMessage", lmsg);
		return "redirect:../cctns/leavedetails";
	}

	@GetMapping("/showallleave")
	public String showallLeave(@PageableDefault(page = 0, size = 6) Pageable p, Model model) {
		// List<ApplyLeave> allrecord = service.getAllEmpDetail();
		Page<ApplyLeave> page = service.getAllEmpDetail(p);
		model.addAttribute("list", page.getContent());
		model.addAttribute("page", page);
		return "showallleaveDetails";
	}

	@GetMapping("/deleteLeaveId/{id}")
	public String deleteLeaveRecords(@PageableDefault(page = 0, size = 6) Pageable p, @PathVariable Integer id,
			Model model) {

		service.deleteByLeaveId(id);

		String delMsg = "Employes Id No - " + id + " Deleted Successfully";
		model.addAttribute("deleteMessage", delMsg);
		// List<ApplyLeave> allrecords = service.getAllEmpDetail();

		// show all emp_records code
		Page<ApplyLeave> page = service.getAllEmpDetail(p);
		model.addAttribute("page", page);
		return "showallleaveDetails";
	}
}
