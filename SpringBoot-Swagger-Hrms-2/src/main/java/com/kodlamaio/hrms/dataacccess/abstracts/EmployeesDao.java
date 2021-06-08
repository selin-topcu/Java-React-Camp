package com.kodlamaio.hrms.dataacccess.abstracts;

import com.kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesDao extends JpaRepository<Employees,Integer> {
}
