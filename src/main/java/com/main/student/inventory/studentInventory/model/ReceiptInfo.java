package com.main.student.inventory.studentInventory.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class ReceiptInfo {

    @Id
    private Integer receiptNo;
    private Integer actualReceiptNo;
    private String createdBy;
    private LocalDateTime createdOn;
    private String updatedBy;
    private LocalDateTime updatedOn;

    public ReceiptInfo() {
    }

    public ReceiptInfo(Integer receiptNo, Integer actualReceiptNo, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn) {
        this.receiptNo = receiptNo;
        this.actualReceiptNo = actualReceiptNo;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Integer getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(Integer receiptNo) {
        this.receiptNo = receiptNo;
    }

    public Integer getActualReceiptNo() {
        return actualReceiptNo;
    }

    public void setActualReceiptNo(Integer actualReceiptNo) {
        this.actualReceiptNo = actualReceiptNo;
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
        ReceiptInfo that = (ReceiptInfo) o;
        return Objects.equals(receiptNo, that.receiptNo) && Objects.equals(actualReceiptNo, that.actualReceiptNo) && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdOn, that.createdOn) && Objects.equals(updatedBy, that.updatedBy) && Objects.equals(updatedOn, that.updatedOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiptNo, actualReceiptNo, createdBy, createdOn, updatedBy, updatedOn);
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