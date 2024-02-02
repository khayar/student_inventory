package com.main.student.inventory.studentInventory.service;

import com.main.student.inventory.studentInventory.model.Receipt;
import com.main.student.inventory.studentInventory.model.Student;
import com.main.student.inventory.studentInventory.model.StudentItemReceipt;
import com.main.student.inventory.studentInventory.repository.StudentItemReceiptRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
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
        student.setCreatedBy("admin");
        student.setCreatedOn(LocalDateTime.now());
        return studentItemReceiptRepository.save(student);
    }
    public StudentItemReceipt updateStudentItemReceipt(Long id, StudentItemReceipt studentItemReceipt) {
        studentItemReceipt.setReceiptId(studentItemReceipt.getReceiptId());
        studentItemReceipt.setStudentId(studentItemReceipt.getStudentId());
        return studentItemReceiptRepository.save(studentItemReceipt);
    }
    public void deleteStudentItemReceipt(Long id) {
        studentItemReceiptRepository.deleteById(id);
    }

    public List<StudentItemReceipt> getStudentByReceiptIdAndStudentId(Integer receiptId,Integer studentId){
        return studentItemReceiptRepository.findByReceiptIdAndStudentId(receiptId,studentId);
    }
}
