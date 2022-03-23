package peaksoft.springfinalexamwork.dto.request;

import lombok.Getter;
import lombok.Setter;
import peaksoft.springfinalexamwork.entity.Company;

import java.util.Set;

@Getter
@Setter
public class CourseRequest {
    private String courseName;
    private String duration;

}
