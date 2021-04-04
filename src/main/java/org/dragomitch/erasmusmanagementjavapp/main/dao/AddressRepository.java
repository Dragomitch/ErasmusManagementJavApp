package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
