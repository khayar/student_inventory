package com.main.student.inventory.studentInventory.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Student{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String createdBy;
    private LocalDateTime createdOn;
    private String updatedBy;
    private LocalDateTime updatedOn;

    public Student() {
    }

    public Student(Long id, String name, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn) {
        this.id = id;
        this.name = name;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(createdBy, student.createdBy) && Objects.equals(createdOn, student.createdOn) && Objects.equals(updatedBy, student.updatedBy) && Objects.equals(updatedOn, student.updatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createdBy, createdOn, updatedBy, updatedOn);
    }

    @PrePersist
    private void beforeInsert(){
        this.setCreatedBy("admin");
        this.setCreatedOn(LocalDateTime.now());
        this.setUpdatedBy("admin");
        this.setUpdatedOn(LocalDateTime.now());
    }
    @PreUpdate
    private void beforeUpdate(){
        this.setUpdatedBy("admin");
        this.setUpdatedOn(LocalDateTime.now());
    }

}
