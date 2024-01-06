package com.main.student.inventory.studentInventory.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemCode;
    private String itemDesc;
    private String createdBy;
    private LocalDateTime createdOn;
    private String updatedBy;
    private LocalDateTime updatedOn;

    public Items() {
    }

    public Items(Long id, String itemCode, String itemDesc, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn) {
        this.id = id;
        this.itemCode = itemCode;
        this.itemDesc = itemDesc;
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

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
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
        Items items = (Items) o;
        return Objects.equals(id, items.id) && Objects.equals(itemCode, items.itemCode) && Objects.equals(itemDesc, items.itemDesc) && Objects.equals(createdBy, items.createdBy) && Objects.equals(createdOn, items.createdOn) && Objects.equals(updatedBy, items.updatedBy) && Objects.equals(updatedOn, items.updatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, itemCode, itemDesc, createdBy, createdOn, updatedBy, updatedOn);
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
