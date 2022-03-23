package peaksoft.springfinalexamwork.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.springfinalexamwork.entity.Course;
import peaksoft.springfinalexamwork.service.CompanyService;
import peaksoft.springfinalexamwork.service.CourseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/c1")
@RequiredArgsConstructor
public class CourseApi {
    private final CourseService courseService;
    private final CompanyService companyService;

    @GetMapping("/courses")
    public List<Course> findAllCompany() {
        return courseService.findAllCourse();
    }

    @PostMapping("/save/course")
    public Course saveCourse(@RequestBody Course course) {
        course.setCompany(companyService.getById(course.getCompanyId()));
        return courseService.saveCourse(course);
    }

    @DeleteMapping("/{id}")
    public Course deleteByIdCompany(@PathVariable("id") Long id) {
        return courseService.deleteByIdCourse(id);
    }

    @GetMapping("/{id}")
    public Optional<Course> findById(@PathVariable("id") Long id) {
        return courseService.findByCourseId(id);
    }

}
