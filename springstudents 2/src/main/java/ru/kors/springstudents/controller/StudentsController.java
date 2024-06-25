package ru.kors.springstudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentsController {
    private StudentService service;

    @GetMapping
    public List<Student> findAllStudent(){
//        todo
       return service.findAllStudent();
    }

    @PostMapping("save_student")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
    @GetMapping("/{email}")
    public Student findByStudent(@PathVariable String email){
        return service.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student){
        return service.updateStuden(student);
    }
    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email){
        service.deleteStudent(email);
    }


}
