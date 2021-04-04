package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.Mobility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobilityRepository extends JpaRepository<Mobility, Long> {
}
