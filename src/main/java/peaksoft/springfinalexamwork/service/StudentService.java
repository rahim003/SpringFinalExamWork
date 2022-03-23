package peaksoft.springfinalexamwork.service;

import org.springframework.stereotype.Service;
import peaksoft.springfinalexamwork.entity.Student;

import java.util.List;
import java.util.Optional;
@Service
public interface StudentService {
    List<Student> findAllStudent();

    Student saveStudent(Student student);


    Optional<Student> findByIdStudent(Long id);


    Student deleteByIdStudent(Long id);
}
