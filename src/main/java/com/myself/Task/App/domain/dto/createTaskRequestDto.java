package com.myself.Task.App.domain.dto;

import com.myself.Task.App.domain.entity.TaskPriority;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
import java.time.LocalDate;

public record createTaskRequestDto(
        @NotBlank(message = ERROR_MESSAGE_TITLE_LENGTH)
        @Length(max = 255, message = ERROR_MESSAGE_TITLE_LENGTH)
        String title,
        @Length(max = 1000, message = ERROR_MESSAGE_DESCRIPTION_LENGTH)
        @Nullable
        String description,
        @FutureOrPresent(message = ERROR_MESSAGE_DUE_DATE_FUTURE)
        @Nullable
        LocalDate dueDate,
        @NotBlank(message = ERROR_MESSAGE_PRIORITY)
        TaskPriority priority
) {
        private static final String ERROR_MESSAGE_TITLE_LENGTH = "Title must be between 1 and 255 characters";
        private static final String ERROR_MESSAGE_DESCRIPTION_LENGTH ="Description must be between 1 and 1000 characters" ;
        private static final String ERROR_MESSAGE_DUE_DATE_FUTURE = "Due date must be future";
        private static final String ERROR_MESSAGE_PRIORITY = "Priority must be given";
}
