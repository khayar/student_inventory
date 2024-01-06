package com.main.student.inventory.studentInventory.repository;

import com.main.student.inventory.studentInventory.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
