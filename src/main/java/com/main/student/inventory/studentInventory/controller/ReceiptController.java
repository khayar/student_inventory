package com.main.student.inventory.studentInventory.controller;

import com.main.student.inventory.studentInventory.model.Receipt;
import com.main.student.inventory.studentInventory.service.ReceiptService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/receipt")
public class ReceiptController {

    private final ReceiptService receiptService;

    public ReceiptController(ReceiptService receiptService) {
        this.receiptService = receiptService;
    }

    @GetMapping
    public List<Receipt> getAllReceipt() {
        return receiptService.getAllReceipt();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Receipt> getReceiptById(@PathVariable("id") Long id) {
        Optional<Receipt> receipt = receiptService.getReceiptById(id);
        return receipt.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Receipt> createReceipt(@RequestBody Receipt receipt) {
        Receipt createdEmployee = receiptService.createReceipt(receipt);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Receipt> updateReceipt(
            @PathVariable("id") Long id,
            @RequestBody Receipt receipt
    ) {
        Optional<Receipt> existingReceipt = receiptService.getReceiptById(id);
        if (existingReceipt.isPresent()) {
            receipt.setCreatedBy(existingReceipt.get().getCreatedBy());
            receipt.setCreatedOn(existingReceipt.get().getCreatedOn());
            Receipt updatedEmployee = receiptService.updateReceipt(id, receipt);
            return ResponseEntity.ok().body(updatedEmployee);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
