package com.sportivity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportivity.model.User;

@Repository("userRepository")// extend CrudRepository
public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);
}
