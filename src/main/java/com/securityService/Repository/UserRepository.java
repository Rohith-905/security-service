package com.securityService.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.securityService.Entity.User;
@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Integer> {
   Optional<User> findByuserName( String userName);

}
