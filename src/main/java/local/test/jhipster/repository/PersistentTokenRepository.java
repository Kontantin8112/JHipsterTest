package local.test.jhipster.repository;

import java.time.LocalDate;
import java.util.List;
import local.test.jhipster.domain.PersistentToken;
import local.test.jhipster.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link PersistentToken} entity.
 */
public interface PersistentTokenRepository extends JpaRepository<PersistentToken, String> {
    List<PersistentToken> findByUser(User user);

    List<PersistentToken> findByTokenDateBefore(LocalDate localDate);
}
