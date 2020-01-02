package com.spingboot.rest.example.cruddemo.student1;

import com.spingboot.rest.example.cruddemo.student1.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
