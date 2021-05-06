package com.dnevnik.kz.dnevnik.controller;

import com.dnevnik.kz.dnevnik.model.Teacher;
import com.dnevnik.kz.dnevnik.service.impl.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dnevnik/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public ResponseEntity<List<Teacher>> getAll() {
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(teacherService.getAll());
    }

    @GetMapping("/{teacherId}")
    public ResponseEntity<Teacher> getById(@PathVariable Long teacherId) {
        return ResponseEntity.ok().body(teacherService.findById(teacherId));
    }

    @PostMapping
    public ResponseEntity<Teacher> create(@RequestBody Teacher teacher) {
        return ResponseEntity.ok().body(teacherService.create(teacher));
    }

    @DeleteMapping("/{teacherId}")
    public ResponseEntity<?> delete(@PathVariable Long teacherId) {
        teacherService.deleteById(teacherId);
        return new ResponseEntity(HttpStatus.OK);
    }


}
