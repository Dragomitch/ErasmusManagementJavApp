package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
