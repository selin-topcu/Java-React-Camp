package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Employees;


import java.util.List;

public interface EmployeesService {
    DataResult<List<Employees>> getAll();

}
