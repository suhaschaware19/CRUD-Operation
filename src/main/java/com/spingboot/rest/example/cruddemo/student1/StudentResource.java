package com.spingboot.rest.example.cruddemo.student1;

import com.spingboot.rest.example.cruddemo.student1.Student;
import com.spingboot.rest.example.cruddemo.student1.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentResource {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    @ResponseBody
    public List<Student> retrieveAllStudents(){
        return studentRepository.findAll();
    }

    @RequestMapping("showdata")
    @ResponseBody
    public String data(){
        return "hello from student";
    }
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable long id){
        studentRepository.deleteById(id);
    }
}
