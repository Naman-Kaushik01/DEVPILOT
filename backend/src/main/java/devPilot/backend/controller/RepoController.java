package devPilot.backend.controller;

import devPilot.backend.security.CurrentUser;
import devPilot.backend.service.github.RepoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/repos")
@RequiredArgsConstructor
public class RepoController {
    private final CurrentUser currentUser;
    private final RepoService repoService;
}
