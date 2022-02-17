package com.microservices.deplartment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.deplartment.entity.Department;
import com.microservices.deplartment.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;



@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
		log.info("saveDepartment Request: " +department);
    	return departmentService.saveDepartment(department);
    }
	
	@GetMapping("/{id}")
	public Department findByDepartmentId(@PathVariable("id") Long departmentId) {
		log.info("findByDepartmentId Request: " +departmentId);
    	return departmentService.findDepartmentById(departmentId);
    }
    
}
