package com.main.student.inventory.studentInventory.model;

import java.io.Serializable;
import java.util.Objects;

public class StudentItemsReceiptIds implements Serializable {

    private Integer receiptId;
    private Integer studentId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentItemsReceiptIds that = (StudentItemsReceiptIds) o;
        return Objects.equals(receiptId, that.receiptId) && Objects.equals(studentId, that.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiptId, studentId);
    }
}
