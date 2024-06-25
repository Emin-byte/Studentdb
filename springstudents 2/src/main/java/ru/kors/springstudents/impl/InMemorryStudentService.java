package ru.kors.springstudents.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.repository.InMemorryStudentDAO;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemorryStudentService implements StudentService {
    private final InMemorryStudentDAO repository;
    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
//        List.of(
//                Student.builder().firstName("Emin").email("m6mintm@gmail.com").age(25).build(),
//                Student.builder().firstName("Tuygun").email("tuyguntm@gmail.com").age(26).build(),
//                Student.builder().firstName("Kudret").email("kudrettm@gmail.com").age(29).build()
//        );
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStuden(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);

    }
}
