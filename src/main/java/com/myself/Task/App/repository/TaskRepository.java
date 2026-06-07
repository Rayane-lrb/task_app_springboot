package com.myself.Task.App.repository;

import com.myself.Task.App.domain.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;



public interface TaskRepository extends JpaRepository<Task, UUID> {

}
