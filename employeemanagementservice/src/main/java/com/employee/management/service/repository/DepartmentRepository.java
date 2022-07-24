package com.employee.management.service.repository;

import org.springframework.data.repository.CrudRepository;
import com.employee.management.model.Department;
public interface DepartmentRepository extends CrudRepository<Department,Integer> {
    
    


}