package com.task5.webRPS.repo;

import com.task5.webRPS.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findFirstByEmailAndClientName(String email, String clientName);
}
