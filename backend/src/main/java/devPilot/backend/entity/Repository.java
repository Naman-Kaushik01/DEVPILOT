package devPilot.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "repositories", uniqueConstraints = @UniqueConstraint(columnNames = { "user_id", "github_repo_id" }))
public class Repository {

}
