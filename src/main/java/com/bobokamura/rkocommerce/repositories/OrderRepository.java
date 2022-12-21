package com.bobokamura.rkocommerce.repositories;


import com.bobokamura.rkocommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
