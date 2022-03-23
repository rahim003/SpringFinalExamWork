package peaksoft.springfinalexamwork.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import peaksoft.springfinalexamwork.entity.Group;
import peaksoft.springfinalexamwork.repository.GroupRepository;
import peaksoft.springfinalexamwork.service.GroupService;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;
    @Override
    public Group saveGroup(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public List<Group> findAllGroup() {
        return groupRepository.findAll();
    }

    @Override
    public Optional<Group> findByIdGroup(Long id) {
        return groupRepository.findById(id);
    }

    @Override
    public Group deleteByIdGroup(Long id) {
        groupRepository.deleteById(id);
        return null;
    }
}
