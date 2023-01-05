package com.example.one2manyshkolata.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String studentName;
    @Column(name = "birthdate")
    private Date birthDate;
    @Column(name = "phone")
    private BigInteger phone;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
}
