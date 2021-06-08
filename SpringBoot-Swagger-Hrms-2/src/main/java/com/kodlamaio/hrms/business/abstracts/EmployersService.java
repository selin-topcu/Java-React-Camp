package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Employers;

import java.util.List;

public interface EmployersService {
    DataResult<List<Employers>> getAll();
}
