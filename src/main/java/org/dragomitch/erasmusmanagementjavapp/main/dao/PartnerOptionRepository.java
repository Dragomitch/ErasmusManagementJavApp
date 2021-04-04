package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.PartnerOption;
import org.dragomitch.erasmusmanagementjavapp.main.business.PartnerOptionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartnerOptionRepository extends JpaRepository<PartnerOption, PartnerOptionId> {
}
