package com.waypoint;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GithubRepo {

    private String name;
    private String description;

    @JsonProperty("html_url")
    private String htmlUrl;

    private String language;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
