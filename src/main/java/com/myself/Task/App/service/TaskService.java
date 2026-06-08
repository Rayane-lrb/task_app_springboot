package com.myself.Task.App.service;

import com.myself.Task.App.domain.CreateTaskRequest;
import com.myself.Task.App.domain.entity.Task;

public interface TaskService {
    Task createTask(CreateTaskRequest request);
}
