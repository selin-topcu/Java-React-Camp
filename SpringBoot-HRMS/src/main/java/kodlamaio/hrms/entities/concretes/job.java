package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="job_titles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class job {
    @Id
    @GeneratedValue

    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

}
