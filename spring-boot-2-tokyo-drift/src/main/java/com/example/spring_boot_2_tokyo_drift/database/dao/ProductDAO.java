package com.example.spring_boot_2_tokyo_drift.database.dao;

import com.example.spring_boot_2_tokyo_drift.database.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDAO extends JpaRepository<Product, Long> {
    Product findById(Integer id);
}
