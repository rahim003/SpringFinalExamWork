package peaksoft.springfinalexamwork.service;

import org.springframework.stereotype.Service;
import peaksoft.springfinalexamwork.dto.request.CourseRequest;
import peaksoft.springfinalexamwork.dto.response.CourseRespons;
import peaksoft.springfinalexamwork.entity.Course;

import java.util.List;
import java.util.Optional;
@Service
public interface CourseService {
    Course saveCourse(Course course);
    List<Course> findAllCourse();
    Optional<Course> findByCourseId(Long id);
    Course deleteByIdCourse(Long id);
}
