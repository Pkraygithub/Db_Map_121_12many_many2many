package com.cctns.goapolice.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CctnsEmpRosterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CctnsEmpRosterApplication.class, args);
	}
}
