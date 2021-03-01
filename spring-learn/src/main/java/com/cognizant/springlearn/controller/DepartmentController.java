package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Department;
import com.cognizant.springlearn.Employee;
import com.cognizant.springlearn.SpringLearnApplication;
import com.cognizant.springlearn.service.DepartmentService;

@RestController
public class DepartmentController {
	private static Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/departments")
	public List<Department> getAllEmployees() {
		LOGGER.info("START");
		LOGGER.info("END");
		return departmentService.getAllDepartments();
	}

}
