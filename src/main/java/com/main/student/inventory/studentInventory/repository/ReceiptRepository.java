package com.main.student.inventory.studentInventory.repository;

import com.main.student.inventory.studentInventory.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
