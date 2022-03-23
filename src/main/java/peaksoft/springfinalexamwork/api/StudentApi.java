package peaksoft.springfinalexamwork.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.springfinalexamwork.entity.Company;
import peaksoft.springfinalexamwork.entity.Student;
import peaksoft.springfinalexamwork.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/s1")
@RequiredArgsConstructor
public class StudentApi {
    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudent() {
        return studentService.findAllStudent();
    }

    @PostMapping("/save/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public Student deleteByIdStudent(@PathVariable("id") Long id) {
        return studentService.deleteByIdStudent(id);
    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable("id") Long id) {
        return studentService.findByIdStudent(id);
    }
}
