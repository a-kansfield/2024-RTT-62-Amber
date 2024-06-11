package demo.java.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor



@Table(name = "employees")
public class Employee {

    @Id // this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // this is telling hibernate that the PK is auto increment
    @Column(name = "id")
    private Integer id;

    @Column(name = "office_id")
    private Integer officeId;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "firstname")
    private String firstname;

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

    @Column(name = "profile_image_url")
    private String profileImageUrl;

    @ToString.Exclude
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY,
        cascade = CascadeType.ALL)
    private List<Customer> customers;

    //Minimum Mandatory Info Constructor
    public Employee (Integer officeId, String firstname, String lastname, String extension, String email, String jobTitle) {
        this.officeId = officeId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.extension = extension;
        this.email = email;
        this.jobTitle = jobTitle;
    }
}
