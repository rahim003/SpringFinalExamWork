package peaksoft.springfinalexamwork.dto.response;

import lombok.Getter;
import lombok.Setter;
import peaksoft.springfinalexamwork.entity.Company;

import java.util.Set;

@Getter
@Setter
public class CourseRespons {
    private String id;
    private String courseName;
    private String duration;
    private String companyId;


}
