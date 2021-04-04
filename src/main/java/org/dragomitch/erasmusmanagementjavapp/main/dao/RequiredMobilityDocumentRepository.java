package org.dragomitch.erasmusmanagementjavapp.main.dao;

import org.dragomitch.erasmusmanagementjavapp.main.business.RequiredMobilityDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface RequiredMobilityDocumentRepository extends JpaRepository<RequiredMobilityDocument, Long> {
}
