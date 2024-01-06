package com.main.student.inventory.studentInventory.service;

import com.main.student.inventory.studentInventory.model.Receipt;
import com.main.student.inventory.studentInventory.repository.ReceiptRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceiptService {

    private final ReceiptRepository receiptRepository;

    public ReceiptService(ReceiptRepository receiptRepository) {
        this.receiptRepository = receiptRepository;
    }
    public List<Receipt> getAllReceipt() {
        return receiptRepository.findAll();
    }
    public Optional<Receipt> getReceiptById(Long id) {
        return receiptRepository.findById(id);
    }
    public Receipt createReceipt(Receipt receipt) {
        return receiptRepository.save(receipt);
    }
    public Receipt updateReceipt(Long id, Receipt receipt) {
        receipt.setId(id);
        return receiptRepository.save(receipt);
    }
}
