package peaksoft.springfinalexamwork.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.springfinalexamwork.entity.Company;
import peaksoft.springfinalexamwork.entity.Group;
import peaksoft.springfinalexamwork.service.GroupService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/g1")
@RequiredArgsConstructor
public class GroupApi {
    private final GroupService groupService;

    @GetMapping("/groups")
    public List<Group> findAllGroup() {
        return groupService.findAllGroup();
    }

    @PostMapping("/save/group")
    public Group saveGroup(@RequestBody Group group) {
        return groupService.saveGroup(group);
    }

    @DeleteMapping("/{id}")
    public Group deleteByIdCompany(@PathVariable("id") Long id) {
        return groupService.deleteByIdGroup(id);
    }

    @GetMapping("/{id}")
    public Optional<Group> findById(@PathVariable("id") Long id) {
        return groupService.findByIdGroup(id);
    }
}
