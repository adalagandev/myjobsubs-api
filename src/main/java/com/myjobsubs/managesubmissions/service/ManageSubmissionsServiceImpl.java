package com.myjobsubs.managesubmissions.service;

import com.myjobsubs.managesubmissions.domain.SubmissionEntity;
import com.myjobsubs.managesubmissions.exception.ManageSubmissionException;
import com.myjobsubs.managesubmissions.persistence.SubmissionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManageSubmissionsServiceImpl implements  ManageSubmissionsService{

    @Autowired
    SubmissionsRepo submissionsRepo;
    @Override
    public List<SubmissionEntity> getAllMySubmissions() {
        return submissionsRepo.findAll();
    }

    @Override
    public void addSubmission(SubmissionEntity submission) {
        submissionsRepo.save(submission);
    }
}
