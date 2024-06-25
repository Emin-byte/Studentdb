package ru.kors.springstudents.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.Period;

@Data
@Builder
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue

    private Long id;
    private String firstName;
    private String lastname;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public int getAge() {
        return Period.between(dateOfBirth,LocalDate.now()).getYears()+1;
    }
}
