package com.waypoint;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getTasks() {
        return service.getTasks();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable long id) {
        return service.getTask(id);
    }

    @GetMapping("/today")
    public List<Task> getTasksToday() {
        return service.getTaskToday();
    }

    @GetMapping("/week")
    public List<Task> getTasksWeek() {
        return service.getTaskWeek();
    }

    @GetMapping("/month")
    public List<Task> getTasksMonth() {
        return service.getTaskMonth();
    }

    @GetMapping("/range")
    public List<Task> getTasksInRange(
        @RequestBody GetTasksInRangeRequest body
    ) {
        return service.getTasksInRange(body.getStartTime(), body.getEndTime());
    }

    @PostMapping
    public Task createTask(@RequestBody CreateTaskRequest body) {
        return service.createTask(
            body.getStartTime(),
            body.getEndTime(),
            body.getTitle()
        );
    }

    @PutMapping("/{id}")
    public Task updateTask(
        @PathVariable long id,
        @RequestBody UpdateTaskRequest body
    ) {
        return service.updateTask(
            id,
            body.getStartTime(),
            body.getEndTime(),
            body.getTitle()
        );
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable long id) {
        service.deleteTask(id);
    }
}
