package com.myjobsubs.managesubmissions.presentation;


import com.myjobsubs.managesubmissions.domain.SubmissionEntity;
import com.myjobsubs.managesubmissions.exception.ManageSubmissionException;
import com.myjobsubs.managesubmissions.service.ManageSubmissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/submissions")
public class ManageSubmissionsController {
    @Autowired
    ManageSubmissionsService manageSubmissionsService;

    @GetMapping("/all")
    public List<SubmissionEntity> getAllSubmissions() throws ManageSubmissionException {
        //todo lists is tied to the login user
        return manageSubmissionsService.getAllMySubmissions();
    }
}
