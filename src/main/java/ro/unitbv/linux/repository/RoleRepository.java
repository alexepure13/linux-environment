package ro.unitbv.linux.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.unitbv.linux.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
}
