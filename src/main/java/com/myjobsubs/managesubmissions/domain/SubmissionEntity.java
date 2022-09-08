package com.myjobsubs.managesubmissions.domain;

import javax.persistence.*;

@Entity
@Table(name="SUBMISSIONS_T")
public class SubmissionEntity {
//job title, base salary, benefits, candidate's special requirement
    @Id
    @GeneratedValue
    private Long submissionId;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="max_base_salary")
    private Long maxBaseSalary;


    public Long getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(Long submissionId) {
        this.submissionId = submissionId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Long getMaxBaseSalary() {
        return maxBaseSalary;
    }

    public void setMaxBaseSalary(Long maxBaseSalary) {
        this.maxBaseSalary = maxBaseSalary;
    }

}
