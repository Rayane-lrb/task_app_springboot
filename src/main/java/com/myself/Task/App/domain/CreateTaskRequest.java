package com.myself.Task.App.domain;

import java.time.LocalDate;

public class CreateTaskRequest {
    public record createTaskRequest(String title, String description, LocalDate dueDate, String priority) {


    }
}
