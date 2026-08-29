package devPilot.backend.repository;

import devPilot.backend.entity.User;
import org.hibernate.internal.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByGithubId(Long githubId);
}
