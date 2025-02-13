package com.cctns.goapolice.in.repo;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cctns.goapolice.in.model.ApplyLeave;

public interface ApplyLeaveRepo  extends JpaRepository<ApplyLeave, Integer>{


	/*
	 * Page<ApplyLeave> findAll(Pageable pageable);
	 */

	

}
