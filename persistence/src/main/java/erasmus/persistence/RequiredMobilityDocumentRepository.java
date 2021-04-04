package erasmus.persistence;

import erasmus.domain.RequiredMobilityDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RestController @Repository
public interface RequiredMobilityDocumentRepository extends JpaRepository<RequiredMobilityDocument, Long> {
}
