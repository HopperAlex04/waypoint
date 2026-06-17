package com.waypoint;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class GithubProjectRepository implements ProjectRepository {

    private final GithubClient githubClient;
    private final PortfolioProperties properties;

    public GithubProjectRepository(
        GithubClient githubClient,
        PortfolioProperties properties
    ) {
        this.githubClient = githubClient;
        this.properties = properties;
    }

    public List<String> getConfiguredRepos() {
        return properties
            .getProjects()
            .stream()
            .map(PortfolioProperties.ProjectConfig::getRepo)
            .toList();
    }

    public List<GithubRepo> findAll() {
        List<GithubRepo> repos = new ArrayList<>();

        for (PortfolioProperties.ProjectConfig config : properties.getProjects()) {
            repos.add(
                githubClient.getRepository("HopperAlex04", config.getRepo())
            );
        }

        return repos;
    }
}
