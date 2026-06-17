package com.waypoint.projects;

import java.util.List;

public interface ProjectRepository {
    List<GithubRepo> findAll();
}
