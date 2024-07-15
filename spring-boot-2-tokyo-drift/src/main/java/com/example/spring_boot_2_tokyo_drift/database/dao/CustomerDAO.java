package com.example.spring_boot_2_tokyo_drift.database.dao;

import com.example.spring_boot_2_tokyo_drift.database.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface CustomerDAO extends JpaRepository<Customer, Long> {
    Customer findById(Integer id);

    //Searches both contact first name, and customer name. Returns any match.
    @Query(
            "SELECT c "
            +   "FROM Customer c "
            +   "WHERE CONCAT(c.contactFirstName, ' ', c.contactLastName) "
            +   "LIKE CONCAT('%', :name, '%')"
            +       "OR "
            +   "c.customerName "
            +   "LIKE CONCAT('%', :name, '%')"
    )
    List<Customer> findByNameOrCode(String name);

    //Finds all customers handled by specific employee (using salesRepID/ Employee ID)
    @Query(
            "SELECT c "
            +   "FROM Customer c "
            +   "WHERE c.salesRepID = :id"
    )
    List<Customer> findBySalesRepID(Integer id);
}
