package com.bobokamura.rkocommerce.repositories;

import com.bobokamura.rkocommerce.entities.Payment;
import com.bobokamura.rkocommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
