package com.waypoint;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable int id) {
        return service.getTask(id);
    }

    @PostMapping
    public Task createTask(@RequestBody CreateTaskRequest body) {
        return service.createTask(
            body.getStartTime(),
            body.getEndTime(),
            body.getTitle()
        );
    }
}
