package com.main.student.inventory.studentInventory.util;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.main.student.inventory.studentInventory.model.ReceiptInfo;
import com.main.student.inventory.studentInventory.model.Student;

import java.io.IOException;

public class ReceiptInfoDeserlizer extends JsonDeserializer<ReceiptInfo> {
    @Override
    public ReceiptInfo deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        if(jsonParser == null)return null;

        ReceiptInfo receiptInfo = new ReceiptInfo();
        receiptInfo.setReceiptNo( jsonParser.getIntValue());
        return receiptInfo;
    }
}
