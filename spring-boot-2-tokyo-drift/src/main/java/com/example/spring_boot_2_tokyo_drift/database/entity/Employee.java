package com.example.spring_boot_2_tokyo_drift.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Integer id;

    @Column(name="office_id")
    private Integer officeID;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "extension")
    private String extension;

    @Column(name = "email")
    private String email;

    @Column(name = "reports_to")
    private Integer reportsTo;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "vacation_hours")
    private Integer vacationHours;
}
