package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.ErasmusProgram;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErasmusProgramRepository extends JpaRepository<ErasmusProgram, Long> {
}
