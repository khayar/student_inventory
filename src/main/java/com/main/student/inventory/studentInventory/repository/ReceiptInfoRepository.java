package com.main.student.inventory.studentInventory.repository;

import com.main.student.inventory.studentInventory.model.ReceiptInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptInfoRepository extends JpaRepository<ReceiptInfo, Long> {
}
