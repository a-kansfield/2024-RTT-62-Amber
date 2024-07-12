package com.example.spring_boot_2_tokyo_drift.database.dao;

import com.example.spring_boot_2_tokyo_drift.database.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product, Long> {
    Product findById(Integer id);

    @Query("SELECT p from Product p WHERE p.productName LIKE CONCAT('%', :name, '%')")
    List<Product> findByNameOrCode(String name);
}
