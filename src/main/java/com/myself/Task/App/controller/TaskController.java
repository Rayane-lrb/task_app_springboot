package com.myself.Task.App.controller;

import com.myself.Task.App.domain.CreateTaskRequest;
import com.myself.Task.App.domain.dto.TaskDto;
import com.myself.Task.App.domain.dto.createTaskRequestDto;
import com.myself.Task.App.domain.entity.Task;
import com.myself.Task.App.mapper.TaskMapper;
import com.myself.Task.App.service.TaskService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/tasks")
public class TaskController {

    private final TaskService taskService;
    private final TaskMapper taskMapper;


    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }


    @PostMapping
    public ResponseEntity<TaskDto> createTask(
        @Valid @RequestBody createTaskRequestDto createTaskRequestDto
    ) {
        CreateTaskRequest createTaskRequest = taskMapper.fromDto(createTaskRequestDto);
        Task task = taskService.createTask(createTaskRequest);
        TaskDto createdTaskDto = taskMapper.toDto(task);
        return new ResponseEntity<>(createdTaskDto, HttpStatus.CREATED);
    }
}
