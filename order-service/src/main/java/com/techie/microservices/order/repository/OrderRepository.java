package com.techie.microservices.order.repository;

import com.techie.microservices.order.modell.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
