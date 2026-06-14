package com.waypoint;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task getTask(int id) {
        return repository.get(id);
    }

    public Task createTask(
        LocalDateTime start_time,
        LocalDateTime end_time,
        String title
    ) {
        return repository.post(start_time, end_time, title);
    }

    // public Task updateTask(Long id, String title) {
    //     return repository.update(id, title);
    // }

    // public void deleteTask(Long id) {
    //     repository.delete(id);
    // }
}
