package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.EmployersService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.dataacccess.abstracts.EmployeesDao;
import com.kodlamaio.hrms.dataacccess.abstracts.EmployersDao;
import com.kodlamaio.hrms.entities.concretes.Employees;
import com.kodlamaio.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployersManager implements EmployersService {
    private EmployersDao employersDao;

    @Autowired
    public EmployersManager(EmployersDao employersDao) {
        this.employersDao = employersDao;
    }


    @Override
    public DataResult<List<Employers>> getAll() {
        return new SuccessDataResult<List<Employers>>
                (this.employersDao.findAll(), "Data Listelendi");
    }
}
