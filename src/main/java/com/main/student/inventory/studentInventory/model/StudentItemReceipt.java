package com.main.student.inventory.studentInventory.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@IdClass(StudentItemsReceiptIds.class)
public class StudentItemReceipt {

    @Id
    @Column(name = "receipt_id")
    private Integer receiptId;
    @Id
    @Column(name = "student_id")
    private Integer studentId;
    @Id
    @Column(name = "item_id")
    private Integer itemId;
    @Column(name = "order_qty")
    private Integer orderQty;
    @Column(name = "iss_qty")
    private Integer issQty;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_on")
    private LocalDateTime createdOn;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "updated_on")
    private LocalDateTime updatedOn;


    public StudentItemReceipt() {
    }

    public StudentItemReceipt(Integer receiptId, Integer studentId, Integer itemId, Integer orderQty, Integer issQty, String createdBy, LocalDateTime createdOn, String updatedBy, LocalDateTime updatedOn) {
        this.receiptId = receiptId;
        this.studentId = studentId;
        this.itemId = itemId;
        this.orderQty = orderQty;
        this.issQty = issQty;
        this.createdBy = createdBy;
        this.createdOn = createdOn;
        this.updatedBy = updatedBy;
        this.updatedOn = updatedOn;
    }

    public Integer getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    public Integer getIssQty() {
        return issQty;
    }

    public void setIssQty(Integer issQty) {
        this.issQty = issQty;
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
