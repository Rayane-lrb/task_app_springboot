package com.myself.Task.App.mapper;

import com.myself.Task.App.domain.CreateTaskRequest;
import com.myself.Task.App.domain.dto.TaskDto;
import com.myself.Task.App.domain.dto.createTaskRequestDto;
import com.myself.Task.App.domain.entity.Task;

public interface TaskMapper {

    CreateTaskRequest fromDto(createTaskRequestDto dto);

    TaskDto toDto(Task task);
}
