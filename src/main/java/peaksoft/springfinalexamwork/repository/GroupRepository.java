package peaksoft.springfinalexamwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.springfinalexamwork.entity.Group;

import java.util.List;
import java.util.Optional;
@Repository
public interface GroupRepository extends JpaRepository<Group,Long> {
    @Override
    List<Group> findAll();

    @Override
    <S extends Group> S save(S entity);

    @Override
    Optional<Group> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
