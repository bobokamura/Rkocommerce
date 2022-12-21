package com.bobokamura.rkocommerce.repositories;

import com.bobokamura.rkocommerce.entities.Product;
import com.bobokamura.rkocommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUsers();
}
