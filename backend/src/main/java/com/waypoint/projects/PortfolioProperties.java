package com.waypoint.projects;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "portfolio")
public class PortfolioProperties {

    private List<ProjectConfig> projects;

    public List<ProjectConfig> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectConfig> projects) {
        this.projects = projects;
    }

    public static class ProjectConfig {

        private String repo;

        // private boolean featured;
        // private int displayOrder;

        public String getRepo() {
            return repo;
        }

        public void setRepo(String repo) {
            this.repo = repo;
        }

        // public boolean isFeatured() { return featured; }
        // public void setFeatured(boolean featured) { this.featured = featured; }

        // public int getDisplayOrder() { return displayOrder; }
        // public void setDisplayOrder(int displayOrder) { this.displayOrder = displayOrder; }
    }
}
