package com.fernandoangeli.dsmovie.repositories;

import com.fernandoangeli.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
