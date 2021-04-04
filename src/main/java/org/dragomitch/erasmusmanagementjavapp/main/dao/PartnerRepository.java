package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
}
