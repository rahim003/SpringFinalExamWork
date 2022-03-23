package peaksoft.springfinalexamwork.mapper.view;

import org.springframework.stereotype.Component;
import peaksoft.springfinalexamwork.dto.response.CourseRespons;
import peaksoft.springfinalexamwork.entity.Course;

import java.util.ArrayList;
import java.util.List;
@Component
public class CourseViewMapper {
    public CourseRespons viewCompany(Course course){
        if(course==null){
            return null;
        }
        CourseRespons courseRespons=new CourseRespons();
        if(courseRespons!=null){
            courseRespons.setId(String.valueOf(course.getId()));
        }
        courseRespons.setCourseName(course.getCourseName());
        courseRespons.setDuration(course.getDuration());
        return courseRespons;

    }

    public List<CourseRespons> viewCompanies(List<Course> courses){
        List<CourseRespons>courseRespons=new ArrayList<>();
        for (Course c:courses
        ) {
            courseRespons.add(viewCompany(c));
        }
        return courseRespons;
    }
}
