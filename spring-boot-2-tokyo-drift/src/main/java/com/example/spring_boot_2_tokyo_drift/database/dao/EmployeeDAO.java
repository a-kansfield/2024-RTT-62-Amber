package com.example.spring_boot_2_tokyo_drift.database.dao;

import com.example.spring_boot_2_tokyo_drift.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {
    Employee findById(Integer id);

    @Query( "SELECT e "
            +   "FROM Employee e "
            +   "WHERE CONCAT(e.firstName, ' ', e.lastName) "
            +   "LIKE CONCAT('%', :name, '%')")
    List<Employee> findByNameOrCode(String name);

    @Query("SELECT DISTINCT e.extension FROM Employee e")
    List<String> getExtensions();

    @Query("SELECT DISTINCT e.jobTitle FROM Employee e")
    List<String> getJobTitles();
}
