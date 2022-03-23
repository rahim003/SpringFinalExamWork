package peaksoft.springfinalexamwork.service;

import org.springframework.stereotype.Service;
import peaksoft.springfinalexamwork.entity.Teacher;

import java.util.List;
import java.util.Optional;
@Service
public interface TeacherService {

    List<Teacher> findAllTeacher();


    Teacher saveTeacher(Teacher teacher);

    Optional<Teacher> findByIdTeacher(Long id);


    Teacher deleteByIdTeacher(Long id);
}
