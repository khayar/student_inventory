package com.main.student.inventory.studentInventory.service;

import com.main.student.inventory.studentInventory.model.ReceiptInfo;
import com.main.student.inventory.studentInventory.model.Student;
import com.main.student.inventory.studentInventory.repository.ReceiptInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReceiptInfoService {

    private final ReceiptInfoRepository receiptInfoRepository;
    public ReceiptInfoService(ReceiptInfoRepository receiptInfoRepository) {
        this.receiptInfoRepository = receiptInfoRepository;
    }
    public List<ReceiptInfo> getAllReceipt() {
        return receiptInfoRepository.findAll();
    }
    public Optional<ReceiptInfo> getReceiptById(Long id) {
        return receiptInfoRepository.findById(id);
    }
    public ReceiptInfo createReceiptInfo(ReceiptInfo receiptInfo) {
        return receiptInfoRepository.save(receiptInfo);
    }
    public ReceiptInfo updateReceipt(Long id, ReceiptInfo receiptInfo) {
        receiptInfo.setId(id);
        return receiptInfoRepository.save(receiptInfo);
    }

}
