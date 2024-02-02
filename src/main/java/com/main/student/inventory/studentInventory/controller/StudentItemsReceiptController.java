package com.main.student.inventory.studentInventory.controller;

import com.main.student.inventory.studentInventory.model.Items;
import com.main.student.inventory.studentInventory.model.StudentItemReceipt;
import com.main.student.inventory.studentInventory.service.ItemsService;
import com.main.student.inventory.studentInventory.service.StudentItemReceiptService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentItemsReceipt")
public class StudentItemsReceiptController {

    private final StudentItemReceiptService studentItemReceiptService;

    public StudentItemsReceiptController(StudentItemReceiptService studentItemReceiptService) {
        this.studentItemReceiptService = studentItemReceiptService;
    }
    @GetMapping
    public List<StudentItemReceipt> getAllStudentItemReceipt() {
        return studentItemReceiptService.getAllStudentItemReceipt();
    }
    @GetMapping("/{id}")
    public ResponseEntity<StudentItemReceipt> getStudentItemReceiptById(@PathVariable("id") Long id) {
        Optional<StudentItemReceipt> receipt = studentItemReceiptService.getStudentItemReceiptById(id);
        return receipt.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/receiptId/{receiptId}/studentId/{studentId}")
    public List<StudentItemReceipt> getStudentItemReceiptByReceiptIdAndStudentId(@PathVariable("receiptId") Integer receiptId,@PathVariable("studentId") Integer studentId) {
        return studentItemReceiptService.getStudentByReceiptIdAndStudentId(receiptId,studentId);
    }
    @PostMapping
    public ResponseEntity<StudentItemReceipt> createStudentItemReceipt(@RequestBody StudentItemReceipt studentItemReceipt) {
        StudentItemReceipt createdStudentItemReceipt = studentItemReceiptService.createStudentItemReceipt(studentItemReceipt);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStudentItemReceipt);
    }
    @PutMapping("/{id}")
    public ResponseEntity<StudentItemReceipt> updateStudentItemReceipt(
            @PathVariable("id") Long id,
            @RequestBody StudentItemReceipt studentItemReceipt
    ) {
        Optional<StudentItemReceipt> existingItems = studentItemReceiptService.getStudentItemReceiptById(id);
        if (existingItems.isPresent()) {
            studentItemReceipt.setCreatedBy(existingItems.get().getCreatedBy());
            studentItemReceipt.setCreatedOn(existingItems.get().getCreatedOn());
            StudentItemReceipt updatedStudentItemReceipt = studentItemReceiptService.updateStudentItemReceipt (id, studentItemReceipt);
            return ResponseEntity.ok().body(updatedStudentItemReceipt);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudentItemReceipt(@PathVariable("id") Long id) {
        Optional<StudentItemReceipt> existingItem = studentItemReceiptService.getStudentItemReceiptById(id);
        if (existingItem.isPresent()) {
            studentItemReceiptService.deleteStudentItemReceipt(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
