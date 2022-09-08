package com.myjobsubs.managesubmissions.service;

import com.myjobsubs.managesubmissions.domain.SubmissionEntity;
import com.myjobsubs.managesubmissions.exception.ManageSubmissionException;

import java.util.List;

public interface ManageSubmissionsService {

    List<SubmissionEntity> getAllMySubmissions() throws ManageSubmissionException;
}
