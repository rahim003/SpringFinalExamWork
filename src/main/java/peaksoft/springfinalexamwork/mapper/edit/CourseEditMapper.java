package peaksoft.springfinalexamwork.mapper.edit;

import org.springframework.stereotype.Component;
import peaksoft.springfinalexamwork.dto.request.CourseRequest;
import peaksoft.springfinalexamwork.entity.Course;

@Component
public class CourseEditMapper {
    public Course create(CourseRequest courseRequest) {
        if (courseRequest == null) {
            return null;
        }
        Course course = new Course();
        course.setCourseName(courseRequest.getCourseName());
        course.setDuration(courseRequest.getDuration());
        return course;
    }

    public void Update(Course course, CourseRequest courseRequest) {
        course.setCourseName(courseRequest.getCourseName());
        course.setDuration(course.getDuration());

    }
}
