package com.myself.Task.App.domain.dto;

import com.myself.Task.App.domain.entity.TaskPriority;
import com.myself.Task.App.domain.entity.TaskStatus;

import java.time.LocalDate;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDate dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
