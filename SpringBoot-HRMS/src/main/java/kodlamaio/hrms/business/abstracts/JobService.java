package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.job;

import java.util.List;

public interface JobService {
    List<job> getAll();
}
