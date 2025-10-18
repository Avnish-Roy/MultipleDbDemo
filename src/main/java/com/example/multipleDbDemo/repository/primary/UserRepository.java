package com.example.multipleDbDemo.repository.primary;

import com.example.multipleDbDemo.entity.primary.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
