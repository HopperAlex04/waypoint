package com.waypoint.projects;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectRepository repository;

    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    public List<Project> getProjects() {
        List<GithubRepo> repos = repository.findAll();
        List<Project> projects = new ArrayList<>();

        for (GithubRepo repo : repos) {
            projects.add(toProject(repo));
        }

        return projects;
    }

    private Project toProject(GithubRepo repo) {
        Project project = new Project();

        project.setTitle(repo.getName());
        project.setDescription(repo.getDescription());
        project.setGithubUrl(repo.getHtmlUrl());
        project.setLanguage(repo.getLanguage());

        return project;
    }
}
