package peaksoft.springfinalexamwork.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peaksoft.springfinalexamwork.dto.request.CourseRequest;
import peaksoft.springfinalexamwork.dto.response.CourseRespons;
import peaksoft.springfinalexamwork.entity.Course;
import peaksoft.springfinalexamwork.mapper.edit.CourseEditMapper;
import peaksoft.springfinalexamwork.mapper.view.CourseViewMapper;
import peaksoft.springfinalexamwork.repository.CourseRepository;
import peaksoft.springfinalexamwork.service.CourseService;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
//    private final CourseViewMapper courseViewMapper;
//    private final CourseEditMapper courseEditMapper;
    @Override
    public Course saveCourse(Course course) {
        return  courseRepository.save(course);
    }
    @Override
    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> findByCourseId(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public Course deleteByIdCourse(Long id) {
        courseRepository.deleteById(id);
        return null;
    }
}
