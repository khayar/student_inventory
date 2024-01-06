package com.main.student.inventory.studentInventory.repository;

import com.main.student.inventory.studentInventory.model.StudentItemReceipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentItemReceiptRepository extends JpaRepository<StudentItemReceipt, Long> {
}
