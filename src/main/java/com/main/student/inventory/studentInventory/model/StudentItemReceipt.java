package com.main.student.inventory.studentInventory.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

import java.util.Objects;

@Entity
@IdClass(StudentItemsReceiptIds.class)
public class StudentItemReceipt {

    @Id
    private Integer receiptId;
    @Id
    private Integer studentId;
    private Integer itemId;
    private Integer orderQty;
    private Integer issQty;

    public StudentItemReceipt() {
    }
    public StudentItemReceipt(Integer receiptId, Integer studentId, Integer itemId, Integer orderQty, Integer issQty) {
        this.receiptId = receiptId;
        this.studentId = studentId;
        this.itemId = itemId;
        this.orderQty = orderQty;
        this.issQty = issQty;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentItemReceipt that = (StudentItemReceipt) o;
        return Objects.equals(receiptId, that.receiptId) && Objects.equals(studentId, that.studentId) && Objects.equals(itemId, that.itemId) && Objects.equals(orderQty, that.orderQty) && Objects.equals(issQty, that.issQty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiptId, studentId, itemId, orderQty, issQty);
    }
}
