package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.EmployeesService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.dataacccess.abstracts.EmployeesDao;
import com.kodlamaio.hrms.entities.concretes.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplooyesManager implements EmployeesService {
    private EmployeesDao employeesDao;

    @Autowired
    public EmplooyesManager(EmployeesDao employeesDao) {
        this.employeesDao = employeesDao;
    }


    @Override
    public DataResult<List<Employees>> getAll() {
        return new SuccessDataResult<List<Employees>>
                (this.employeesDao.findAll(), "Data Listelendi");
    }
}
