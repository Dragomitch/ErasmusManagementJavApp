package erasmus.persistence;

import erasmus.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
