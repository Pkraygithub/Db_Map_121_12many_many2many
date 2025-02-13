package com.cctns.goapolice.in.repo;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.cctns.goapolice.in.model.EmpRosterModel;

@Repository
@EnableJpaRepositories
public interface EmpRosterRepositery extends JpaRepository<EmpRosterModel, Integer> {

	@Query(value = "SELECT  * FROM Emp_Roster", nativeQuery = true)
	public List<EmpRosterModel> getAllByeName();

	  
	
	  
	 
}
