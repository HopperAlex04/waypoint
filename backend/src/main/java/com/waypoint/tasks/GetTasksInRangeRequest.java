package com.waypoint.tasks;

import java.time.LocalDateTime;

public class GetTasksInRangeRequest {

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    public GetTasksInRangeRequest() {}

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
