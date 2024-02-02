package com.main.student.inventory.studentInventory.repository;

import com.main.student.inventory.studentInventory.model.StudentItemReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentItemReceiptRepository extends JpaRepository<StudentItemReceipt, Long> {
    List<StudentItemReceipt> findByReceiptIdAndStudentId(Integer receiptId, Integer studentId);
}
