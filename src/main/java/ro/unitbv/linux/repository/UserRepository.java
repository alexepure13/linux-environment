package ro.unitbv.linux.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ro.unitbv.linux.entity.UserAccount;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserAccount, Integer> {
    
	Optional<UserAccount> findByUsername(String username);
}