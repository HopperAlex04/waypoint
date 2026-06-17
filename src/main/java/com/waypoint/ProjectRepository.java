package com.waypoint;

import java.util.List;

public interface ProjectRepository {
    List<GithubRepo> findAll();
}
