package com.main.student.inventory.studentInventory.service;

import com.main.student.inventory.studentInventory.exception.ActualReceiptUniqueException;
import com.main.student.inventory.studentInventory.model.ReceiptInfo;
import com.main.student.inventory.studentInventory.model.Student;
import com.main.student.inventory.studentInventory.repository.ReceiptInfoRepository;
import jakarta.persistence.UniqueConstraint;
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
    public Optional<ReceiptInfo> getReceiptById(Integer id) {
        return receiptInfoRepository.findById(id);
    }
    public ReceiptInfo createReceiptInfo(ReceiptInfo receiptInfo) {
        try {
           return receiptInfoRepository.save(receiptInfo);
        } catch (Throwable ex){
            throw new ActualReceiptUniqueException(receiptInfo.getActualReceiptNo());
        }
    }
    public ReceiptInfo updateReceipt(Integer receiptNo, ReceiptInfo receiptInfo) {
        receiptInfo.setReceiptNo(receiptNo);
        return receiptInfoRepository.save(receiptInfo);
    }

}
