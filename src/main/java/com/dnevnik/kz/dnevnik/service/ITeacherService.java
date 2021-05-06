package com.dnevnik.kz.dnevnik.service;

import com.dnevnik.kz.dnevnik.model.Teacher;

import java.util.List;

public interface ITeacherService {

    Teacher create(Teacher teacher);

    List<Teacher> getAll();

    Teacher findById(Long id);

    void deleteById(Long id);

}
