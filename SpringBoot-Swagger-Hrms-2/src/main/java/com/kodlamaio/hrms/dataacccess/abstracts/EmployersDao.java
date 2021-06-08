package com.kodlamaio.hrms.dataacccess.abstracts;

import com.kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployersDao extends JpaRepository<Employers,Integer> {
}
