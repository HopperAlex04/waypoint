package com.waypoint;

import java.time.LocalDateTime;

public class UpdateTaskRequest {

    LocalDateTime start_time;
    LocalDateTime end_time;
    String title;

    public UpdateTaskRequest() {}

    public LocalDateTime getStartTime() {
        return start_time;
    }

    public LocalDateTime getEndTime() {
        return end_time;
    }

    public String getTitle() {
        return title;
    }

    public void setStartTime(LocalDateTime start_time) {
        this.start_time = start_time;
    }

    public void setEndTime(LocalDateTime end_time) {
        this.end_time = end_time;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
