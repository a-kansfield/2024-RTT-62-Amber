package com.example.spring_boot_2_tokyo_drift.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customers")
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "contact_firstname")
    private String contactFirstName;

    @Column(name = "contact_lastname")
    private String contactLastName;

    @Column(name = "phone")
    private String phoneNum;

    @Column(name = "address_line1")
    private String addressLnOne;

    @Column(name = "address_line2")
    private String addressLnTwo;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "credit_limit", columnDefinition = "DECIMAL")
    private Double creditLimit;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
        @JoinColumn(name = "sales_rep_employee_id", nullable = true)
    private Employee employee;

    @Column(name = "sales_rep_employee_id", insertable = false, updatable = false)
    private Integer salesRepID;

    @ToString.Exclude
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Order> orders;

}
