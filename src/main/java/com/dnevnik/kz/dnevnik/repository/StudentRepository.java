package com.dnevnik.kz.dnevnik.repository;

import com.dnevnik.kz.dnevnik.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
