package com.system.expenseTracker.repo;

import com.system.expenseTracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(
            nativeQuery = true,
            value = "select * from users where uname =?1"
    )
    Optional<User> findUserByuname(String uname);


}
