package peaksoft.springfinalexamwork.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "student1")
@NoArgsConstructor
@Getter
@Setter
@Data
public class Student {
    @SequenceGenerator(name = "student_sequence",
            sequenceName = "student_seq",
            allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "student_sequence")
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "study_format")
    private StudyFormat studyFormat;
    private String email;

    public Student(String firstName, String lastName, StudyFormat studyFormat, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studyFormat = studyFormat;
        this.email = email;
    }
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "group_id")
    private Group group;
}
