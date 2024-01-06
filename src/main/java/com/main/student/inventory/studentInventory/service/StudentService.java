package com.main.student.inventory.studentInventory.service;

import com.main.student.inventory.studentInventory.model.Receipt;
import com.main.student.inventory.studentInventory.model.Student;
import com.main.student.inventory.studentInventory.repository.ReceiptRepository;
import com.main.student.inventory.studentInventory.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }
}
