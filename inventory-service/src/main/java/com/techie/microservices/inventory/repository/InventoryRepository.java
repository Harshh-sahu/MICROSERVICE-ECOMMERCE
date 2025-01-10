package com.techie.microservices.inventory.repository;

import com.techie.microservices.inventory.model.inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<inventory ,Long> {


    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String skuCode, Integer quantity);
}
