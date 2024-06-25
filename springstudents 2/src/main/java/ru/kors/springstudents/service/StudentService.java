package ru.kors.springstudents.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStuden(Student student);
    void deleteStudent(String email);
//    {
//        return List.of(
//                Student.builder().firstName("Emin").lastname("Imamov").email("m6mintm@gamil.com").age(25).build(),
//                Student.builder().firstName("Tuygun").lastname("Imamov").email("tuyguntm@gamil.com").age(26).build(),
//                Student.builder().firstName("Kudret").lastname("Imamov").email("kudtm@gamil.com").age(29).build()
//        );
//    }

}
