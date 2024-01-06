package com.main.student.inventory.studentInventory.service;

import com.main.student.inventory.studentInventory.model.Student;
import com.main.student.inventory.studentInventory.model.StudentItemReceipt;
import com.main.student.inventory.studentInventory.repository.StudentItemReceiptRepository;

import java.util.List;
import java.util.Optional;

public class StudentItemReceiptService {

    private final StudentItemReceiptRepository studentItemReceiptRepository;

    public StudentItemReceiptService(StudentItemReceiptRepository studentItemReceiptRepository) {
        this.studentItemReceiptRepository = studentItemReceiptRepository;
    }

    public List<StudentItemReceipt> getAllStudentItemReceipt() {
        return studentItemReceiptRepository.findAll();
    }
    public Optional<StudentItemReceipt> getStudentItemReceiptById(Long id) {
        return studentItemReceiptRepository.findById(id);
    }
    public StudentItemReceipt createStudentItemReceipt(StudentItemReceipt student) {
        return studentItemReceiptRepository.save(student);
    }
}
