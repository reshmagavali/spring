package com.fullstack.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;

    @Pattern(regexp = "[A-Za-z]*", message = "Name does not contain special character and space")
    private String empName;

    @Pattern(regexp = "[A-Za-z]*", message = "Name does not contain special character and space")
    private String empLastName;
    @Range(min = 1000000000, max = 9999999999L ,message = "enter valid contact number")
    private long empContact;
    @Email(message = "Email Id must be valid")
    private String Empemail;

    @Size(min=4,message = "password must be 4 character")
private String empPass;
    private double empSalary;


}
