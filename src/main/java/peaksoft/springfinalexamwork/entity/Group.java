package peaksoft.springfinalexamwork.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "group1")
@Getter
@Setter
@NoArgsConstructor
@Data
public class Group {
    @SequenceGenerator(name = "group_sequence",
            sequenceName = "group_seq",
            allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_sequence")
    private Long id;
    @Column(name = "group_name")
    private String groupName;
    @Column(name = "date_of_start")
    private LocalDate dateOfStart;
    @Column(name = "date_of_finish")
    private LocalDate dateOfFinish;
    @Transient
    private Long courseId;


    public Group(String groupName, LocalDate dateOfStart, LocalDate dateOfFinish) {
        this.groupName = groupName;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.DETACH, CascadeType.MERGE}, mappedBy = "groupList", fetch = FetchType.LAZY)
    private List<Course> courseList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private List<Student> studentList;
}
