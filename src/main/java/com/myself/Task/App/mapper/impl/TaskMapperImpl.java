package com.myself.Task.App.mapper.impl;

import com.myself.Task.App.domain.CreateTaskRequest;
import com.myself.Task.App.domain.dto.TaskDto;
import com.myself.Task.App.domain.dto.createTaskRequestDto;
import com.myself.Task.App.domain.entity.Task;
import com.myself.Task.App.mapper.TaskMapper;
import org.springframework.stereotype.Component;

@Component
public class TaskMapperImpl implements TaskMapper {

    @Override
    public CreateTaskRequest fromDto(createTaskRequestDto dto) {
        return new CreateTaskRequest(
                dto.title(),
                dto.description(),
                dto.dueDate(),
                dto.priority()
        );
    }

    @Override
    public TaskDto toDto(Task task) {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getDescription(),
                task.getDueDate(),
                task.getPriority(),
                task.getStatus()
        );
    }
}
