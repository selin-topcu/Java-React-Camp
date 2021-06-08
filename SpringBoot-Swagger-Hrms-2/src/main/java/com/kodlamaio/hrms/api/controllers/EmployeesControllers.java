package com.kodlamaio.hrms.api.controllers;


import com.kodlamaio.hrms.business.abstracts.EmployeesService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeesControllers {
    private EmployeesService employeesService;

    private EmployeesControllers(EmployeesService employeesService){
        this.employeesService=employeesService;
    }

    @PostMapping("/getAll")
    DataResult<List<Employees>> getAll(){
        return employeesService.getAll();
    }
}
