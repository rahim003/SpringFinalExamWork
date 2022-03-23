package peaksoft.springfinalexamwork.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peaksoft.springfinalexamwork.entity.Teacher;
import peaksoft.springfinalexamwork.repository.TeacherRepository;
import peaksoft.springfinalexamwork.service.TeacherService;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    @Override
    public List<Teacher> findAllTeacher() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Optional<Teacher> findByIdTeacher(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher deleteByIdTeacher(Long id) {
teacherRepository.deleteById(id);
        return null;
    }
}
