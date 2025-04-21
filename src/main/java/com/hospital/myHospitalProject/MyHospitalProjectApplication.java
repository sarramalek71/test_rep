package com.hospital.myHospitalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@ComponentScan(basePackages = "com.hospital.myHospitalProject")

@EnableJpaRepositories("com.hospital.myHospitalProject.repository")
@EntityScan("com.hospital.myHospitalProject.entity")
@SpringBootApplication
public class MyHospitalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyHospitalProjectApplication.class, args);
	}

}
