package com.dnevnik.kz.dnevnik.controller;

import com.dnevnik.kz.dnevnik.model.Student;
import com.dnevnik.kz.dnevnik.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getAll() {
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(studentService.getAll());
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getById(@PathVariable Long StudentId) {
        return ResponseEntity.ok().body(studentService.findById(StudentId));
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestBody Student student) {
        return ResponseEntity.ok().body(studentService.create(student));
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<?> delete(@PathVariable Long studentId) {
        studentService.deleteById(studentId);
        return new ResponseEntity(HttpStatus.OK);
    }


}
