package com.example.cmp325.model;

import jakarta.persistence.*;

@Entity
public class Course {
    @Id
    private Long id;

    private String courseTitle;
    private String courseCode;
}
