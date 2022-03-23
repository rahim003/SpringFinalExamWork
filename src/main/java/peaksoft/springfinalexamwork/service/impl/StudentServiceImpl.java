package peaksoft.springfinalexamwork.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peaksoft.springfinalexamwork.entity.Student;
import peaksoft.springfinalexamwork.repository.StudentRepository;
import peaksoft.springfinalexamwork.service.StudentService;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    @Override
    public List<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> findByIdStudent(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student deleteByIdStudent(Long id) {
    studentRepository.deleteById(id);
        return null;
    }
}
