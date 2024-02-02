package com.main.student.inventory.studentInventory.exception;

public class ActualReceiptUniqueException extends RuntimeException{

    public ActualReceiptUniqueException(Integer actualReceiptId) {
        super("Actual Receipt Unique violation: " + actualReceiptId);
    }
}
