package com.main.student.inventory.studentInventory.util;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.main.student.inventory.studentInventory.model.Student;

import java.io.IOException;

public class StudentDeserlizer extends JsonDeserializer<Student> {
    @Override
    public Student deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        if(jsonParser == null)return null;

        Student student = new Student();
        student.setId( jsonParser.getLongValue());
        return student;
    }
}
