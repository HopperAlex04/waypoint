package com.waypoint;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class GithubClient {

    private final RestClient restClient;

    public GithubClient() {
        this.restClient = RestClient.create();
    }

    public GithubRepo getRepository(String owner, String repoName) {
        return restClient
            .get()
            .uri("https://api.github.com/repos/{owner}/{repo}", owner, repoName)
            .retrieve()
            .body(GithubRepo.class);
    }
}
