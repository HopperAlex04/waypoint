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

    @PutMapping("/{id}")
    public Task updateTask(
        @PathVariable int id,
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
    public Task deleteTask(@PathVariable int id) {
        return service.deleteTask(id);
    }
}
