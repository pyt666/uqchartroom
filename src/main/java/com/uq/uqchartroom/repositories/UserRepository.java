package com.uq.uqchartroom.repositories;

import com.uq.uqchartroom.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
