package devPilot.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
public class User {
    private UUID id;

    private Long githubId;

    private String githubUserName;

    private String displayName;

    private String avatarUrl;
}
