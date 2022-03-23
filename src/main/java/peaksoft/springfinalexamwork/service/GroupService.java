package peaksoft.springfinalexamwork.service;

import org.springframework.stereotype.Service;
import peaksoft.springfinalexamwork.entity.Group;

import java.util.List;
import java.util.Optional;
@Service
public interface GroupService {

    Group saveGroup(Group group);
  List<Group>findAllGroup();
  Optional<Group>findByIdGroup(Long id);
  Group deleteByIdGroup(Long id);

}
