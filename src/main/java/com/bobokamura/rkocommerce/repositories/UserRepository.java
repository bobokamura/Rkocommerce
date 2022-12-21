package com.bobokamura.rkocommerce.repositories;

import com.bobokamura.rkocommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
