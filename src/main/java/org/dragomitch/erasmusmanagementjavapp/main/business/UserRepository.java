package org.dragomitch.erasmusmanagementjavapp.main.business;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
