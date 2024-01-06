package com.main.student.inventory.studentInventory.repository;

import com.main.student.inventory.studentInventory.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository extends JpaRepository<Items, Long> {
}
