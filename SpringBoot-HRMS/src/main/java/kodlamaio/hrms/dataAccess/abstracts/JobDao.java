package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobDao extends JpaRepository<job,Integer> {
}
