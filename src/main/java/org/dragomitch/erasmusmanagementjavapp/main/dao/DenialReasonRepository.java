package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.DenialReason;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DenialReasonRepository extends JpaRepository<DenialReason, Long> {
}
