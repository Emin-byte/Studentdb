package ru.kors.springstudents.repository;
import org.springframework.stereotype.Repository;
import ru.kors.springstudents.model.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemorryStudentDAO {
    private final List<Student> STUDENTS = new ArrayList<>();

    public List<Student> findAllStudent() {
        return STUDENTS;
    }

    public Student saveStudent(Student student) {
        STUDENTS.add(student);
        return student;
    }

    public Student findByEmail(String email) {
        return STUDENTS.stream()
                .filter(student -> student.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public Student updateStudent(Student student) {
        for (int i = 0; i < STUDENTS.size(); i++) {
            if (STUDENTS.get(i).getEmail().equals(student.getEmail())) {
                STUDENTS.set(i, student);
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(String email) {
        STUDENTS.removeIf(student -> student.getEmail().equals(email));
    }
}
