package kodlamaio.hrms.api.controllers;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.entities.concretes.job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    @Autowired
    private JobService jobService;
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }


    @GetMapping("/getall") //getall diye bir istekte bulunursak aşağıdaki kod çalışacak
    public List<job> getAll(){
        return this.jobService.getAll();
    }

}

