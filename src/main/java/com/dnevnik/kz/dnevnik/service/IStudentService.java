package com.dnevnik.kz.dnevnik.service;

import com.dnevnik.kz.dnevnik.model.Student;

import java.util.List;

public interface IStudentService {

    Student create(Student student);

    List<Student> getAll();

    Student findById(Long id);

    void deleteById(Long id);

}
