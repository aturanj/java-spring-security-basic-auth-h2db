package io.aturanj.springsecurity.persistence;

import io.aturanj.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    public User findByUsername(String username);
}
