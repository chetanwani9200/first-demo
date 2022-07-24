package com.employee.management.service.repository;


import org.springframework.data.repository.CrudRepository;

import com.employee.management.model.Employee;
public interface EmployeeRepository extends CrudRepository <Employee,Integer> {

    
} 
    

