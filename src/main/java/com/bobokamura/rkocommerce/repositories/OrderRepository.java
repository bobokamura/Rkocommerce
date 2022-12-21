package com.bobokamura.rkocommerce.repositories;

import com.bobokamura.rkocommerce.entities.Order;
import com.bobokamura.rkocommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
