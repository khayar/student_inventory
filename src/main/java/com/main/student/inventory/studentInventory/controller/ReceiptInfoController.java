package com.main.student.inventory.studentInventory.controller;

import com.main.student.inventory.studentInventory.model.Items;
import com.main.student.inventory.studentInventory.model.ReceiptInfo;
import com.main.student.inventory.studentInventory.service.ReceiptInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/receiptInfo")
public class ReceiptInfoController {

    private final ReceiptInfoService receiptInfoService;

    public ReceiptInfoController(ReceiptInfoService receiptInfoService) {
        this.receiptInfoService = receiptInfoService;
    }

    @GetMapping
    public List<ReceiptInfo> getAllReceiptInfo() {
        return receiptInfoService.getAllReceipt();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReceiptInfo> getReceiptInfoById(@PathVariable("id") Long id) {
        Optional<ReceiptInfo> receiptInfo = receiptInfoService.getReceiptById(id);
        return receiptInfo.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<ReceiptInfo> createReceiptInfo(@RequestBody ReceiptInfo receiptInfo) {
        ReceiptInfo createdReceiptInfo = receiptInfoService.createReceiptInfo(receiptInfo);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdReceiptInfo);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ReceiptInfo> updateReceipt(
            @PathVariable("id") Long id,
            @RequestBody ReceiptInfo receiptInfo
    ) {
        Optional<ReceiptInfo> existingItems = receiptInfoService.getReceiptById(id);
        if (existingItems.isPresent()) {
            receiptInfo.setCreatedBy(existingItems.get().getCreatedBy());
            receiptInfo.setCreatedOn(existingItems.get().getCreatedOn());
            ReceiptInfo updatedReceiptInfo = receiptInfoService.updateReceipt(id, receiptInfo);
            return ResponseEntity.ok().body(updatedReceiptInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
