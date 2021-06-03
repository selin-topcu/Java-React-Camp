package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {

   DataResult<List<JobTitle>> getAll();
   Result add(JobTitle jobTitle);

}
