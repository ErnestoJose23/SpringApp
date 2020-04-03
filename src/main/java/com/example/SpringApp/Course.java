package com.example.SpringApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    private String courseid;
    private String coursename;
    private String author;

    public Course() {
    }

    public String getCourseid() {
        return courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public String getAuthor() {
        return author;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
