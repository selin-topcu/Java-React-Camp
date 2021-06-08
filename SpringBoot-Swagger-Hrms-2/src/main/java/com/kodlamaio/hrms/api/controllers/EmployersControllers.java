package com.kodlamaio.hrms.api.controllers;

import com.kodlamaio.hrms.business.abstracts.EmployersService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersControllers {
    private EmployersService employersService;

    private EmployersControllers(EmployersService employersService){
        this.employersService=employersService;
    }

    @PostMapping("/getAll")
    DataResult<List<Employers>> getAll(){
        return employersService.getAll();
    }
}
