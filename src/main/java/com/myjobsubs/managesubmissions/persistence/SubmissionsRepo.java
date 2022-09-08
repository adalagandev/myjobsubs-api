package com.myjobsubs.managesubmissions.persistence;

import com.myjobsubs.managesubmissions.domain.SubmissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionsRepo extends JpaRepository<SubmissionEntity, Long> {
}
