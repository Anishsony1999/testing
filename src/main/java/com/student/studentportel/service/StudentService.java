package com.student.studentportel.service;

import com.student.studentportel.model.Student;
import com.student.studentportel.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> allStudent(){
        return studentRepo.findAll();
    }


}
