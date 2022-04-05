package com.company.service;

import com.company.entity.StudentEntity;
import com.company.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void create() {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(UUID.randomUUID().toString());
        studentEntity.setSurname("Surname");
        studentEntity.setAge(22);
        studentRepository.save(studentEntity);
    }

    public List<StudentEntity> list() {
        return studentRepository.findAll();
    }
}
