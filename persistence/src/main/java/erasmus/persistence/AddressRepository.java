package erasmus.persistence;

import erasmus.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}