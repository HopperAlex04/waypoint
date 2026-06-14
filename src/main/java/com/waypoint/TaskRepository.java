package com.waypoint;

import java.time.LocalDateTime;

public interface TaskRepository {
    public Task get(int id);

    public Task post(
        LocalDateTime start_time,
        LocalDateTime end_time,
        String title
    );
}
