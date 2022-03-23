package peaksoft.springfinalexamwork.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.springfinalexamwork.entity.Teacher;
import peaksoft.springfinalexamwork.service.TeacherService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/t1")
@RequiredArgsConstructor
public class TeacherApi {
    private final TeacherService teacherService;

    @GetMapping
    public List<Teacher> findAllTeacher() {
        return teacherService.findAllTeacher();
    }

    @PostMapping("/save/teacher")
    public Teacher saveCompany(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @DeleteMapping("/{id}")
    public Teacher deleteByIdTeacher(@PathVariable("id") Long id) {
        return teacherService.deleteByIdTeacher(id);
    }

    @GetMapping("/{id}")
    public Optional<Teacher> findById(@PathVariable("id") Long id) {
        return teacherService.findByIdTeacher(id);
    }

}
