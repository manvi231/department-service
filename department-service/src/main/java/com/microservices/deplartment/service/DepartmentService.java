package com.microservices.deplartment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.deplartment.entity.Department;
import com.microservices.deplartment.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		log.info("Inseide DepartmentService");
		return departmentRepository.save(department);
	}
	
	public Department findDepartmentById(Long id) {
		return departmentRepository.findByDepartmentId(id);
	}
	
}
