package erasmus.persistence;

import erasmus.domain.NominatedStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RestController @Repository
public interface NominatedStudentRepository extends JpaRepository<NominatedStudent, Long> {
}
