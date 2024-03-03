package com.sample.jwtauthentication.repository;

import com.sample.jwtauthentication.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findUserById(Long id);

    Optional<User> findUserByName(String name);

}
