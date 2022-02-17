package brunel.ac.uk.backend.repository;

import brunel.ac.uk.backend.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Database query created by method name findByEmail
    User findByEmail(String email);
}
