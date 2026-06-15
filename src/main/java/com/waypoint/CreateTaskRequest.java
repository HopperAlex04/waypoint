package com.waypoint;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class CreateTaskRequest {

    private LocalDateTime startTime;

    private LocalDateTime endTime;
    private String title;

    public CreateTaskRequest() {}

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public String getTitle() {
        return title;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
