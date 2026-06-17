package com.waypoint;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getTasks() {
        return repository.findAll();
    }

    public Task getTask(Long id) {
        return repository
            .findById(id)
            .orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public List<Task> getTaskToday() {
        LocalDate today = LocalDate.now();
        LocalDateTime startOfDay = today.atStartOfDay();
        LocalDateTime endOfDay = today.plusDays(1).atStartOfDay();
        return repository.findByStartTimeBetween(startOfDay, endOfDay);
    }

    public List<Task> getTaskWeek() {
        LocalDate today = LocalDate.now();

        LocalDate weekStart = today.with(java.time.DayOfWeek.MONDAY);

        LocalDateTime startOfDay = weekStart.atStartOfDay();
        LocalDateTime endOfDay = weekStart.plusWeeks(1).atStartOfDay();
        return repository.findByStartTimeBetween(startOfDay, endOfDay);
    }

    public List<Task> getTaskMonth() {
        LocalDate today = LocalDate.now();

        LocalDate monthStart = today.withDayOfMonth(1);

        LocalDateTime startOfDay = monthStart.atStartOfDay();
        LocalDateTime endOfDay = monthStart.plusMonths(1).atStartOfDay();
        return repository.findByStartTimeBetween(startOfDay, endOfDay);
    }

    public List<Task> getTasksInRange(LocalDateTime start, LocalDateTime end) {
        return repository.findByStartTimeBetween(start, end);
    }

    public Task createTask(
        LocalDateTime startTime,
        LocalDateTime endTime,
        String title
    ) {
        Task task = new Task();
        task.setStartTime(startTime);
        task.setEndTime(endTime);
        task.setTitle(title);

        return repository.save(task);
    }

    public Task updateTask(
        Long id,
        LocalDateTime startTime,
        LocalDateTime endTime,
        String title
    ) {
        Task task = repository
            .findById(id)
            .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setStartTime(startTime);
        task.setEndTime(endTime);
        task.setTitle(title);

        return repository.save(task);
    }

    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
