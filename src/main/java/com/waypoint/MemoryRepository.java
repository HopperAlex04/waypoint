package com.waypoint;

import java.time.LocalDateTime;
import java.util.Hashtable;

public class MemoryRepository {

    //implements TaskRepository

    private Hashtable<Integer, Task> data;
    int next_id;

    public MemoryRepository() {
        data = new Hashtable<>();
        next_id = 0;
    }

    public Task get(int id) {
        return data.get(id);
    }

    public Task post(
        LocalDateTime start_time,
        LocalDateTime end_time,
        String title
    ) {
        Task new_task = new Task();
        data.put(next_id, new_task);

        next_id++;

        return new_task;
    }

    public Task put(
        int id,
        LocalDateTime start_time,
        LocalDateTime end_time,
        String title
    ) {
        Task task = data.get(id);
        if (task == null) {
            return null;
        }

        task.setStartTime(start_time);
        task.setEndTime(end_time);
        task.setTitle(title);
        return task;
    }

    public Task delete(int id) {
        return data.remove(id);
    }
}
