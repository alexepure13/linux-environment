package ro.unitbv.linux.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unitbv.linux.entity.Command;


@Repository
public interface CommandRepository extends JpaRepository<Command, Integer> {
}
