package com.example.one2manyshkolata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class School {
    @Id
    @Column(name = "id")
    private int schoolId;
    @Column(name = "school_name")
    private String schoolName;
    @Column(name = "city")
    private String city;
    @OneToMany(mappedBy = "school")
    @JsonIgnore
    List<Student> students = new ArrayList<>();
}
