package com.myself.Task.App.service.impl;

import com.myself.Task.App.domain.CreateTaskRequest;
import com.myself.Task.App.domain.entity.Task;
import com.myself.Task.App.domain.entity.TaskStatus;
import com.myself.Task.App.repository.TaskRepository;
import com.myself.Task.App.service.TaskService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskrepository;

    public TaskServiceImpl(TaskRepository taskrepository) {
        this.taskrepository = taskrepository;
    }

    @Override
    public Task createTask(CreateTaskRequest request) {
        Instant now = Instant.now();

        Task task = new Task(
                null,
                request.title(),
                request.description(),
                request.dueDate(),
                TaskStatus.OPEN,
                request.priority(),
                now,
                now
        );

        return taskrepository.save(task);
    }
}
