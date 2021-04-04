package erasmus.persistence;

import erasmus.domain.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RestController @Repository
public interface OptionRepository extends JpaRepository<Option, Long> {
}
