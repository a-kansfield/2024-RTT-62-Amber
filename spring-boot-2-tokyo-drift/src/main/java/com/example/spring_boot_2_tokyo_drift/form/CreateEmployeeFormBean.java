package com.example.spring_boot_2_tokyo_drift.form;

import lombok.*;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {

    private String email;
    private String firstName;
    private String lastName;
    private Integer reportsTo;
}
