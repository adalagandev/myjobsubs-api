package com.myjobsubs.managesubmissions.service;

import com.myjobsubs.managesubmissions.domain.SubmissionEntity;
import com.myjobsubs.managesubmissions.exception.ManageSubmissionException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManageSubmissionsServiceImpl implements  ManageSubmissionsService{
    @Override
    public List<SubmissionEntity> getAllMySubmissions() throws ManageSubmissionException {
        return null;
    }
}
