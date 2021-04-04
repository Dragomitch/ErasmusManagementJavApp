package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.NominatedStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NominatedStudentRepository extends JpaRepository<NominatedStudent, Long> {
}
