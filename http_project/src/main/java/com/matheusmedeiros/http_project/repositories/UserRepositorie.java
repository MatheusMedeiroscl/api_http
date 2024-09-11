package com.matheusmedeiros.http_project.repositories;

import com.matheusmedeiros.http_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorie extends JpaRepository<User,Long> {
}
