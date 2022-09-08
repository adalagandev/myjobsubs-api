package com.myjobsubs.managesubmissions.domain;

import javax.persistence.*;

@Entity
@Table(name="Submissions")
public class SubmissionEntity {
//job title, base salary, benefits, candidate's special requirement
    @Id
    @GeneratedValue
    private Long submissionId;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="max_base_salary")
    private Long maxBaseSalary;

}
