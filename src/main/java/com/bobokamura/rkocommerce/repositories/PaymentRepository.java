package com.bobokamura.rkocommerce.repositories;

import com.bobokamura.rkocommerce.entities.Payment;
import com.bobokamura.rkocommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
