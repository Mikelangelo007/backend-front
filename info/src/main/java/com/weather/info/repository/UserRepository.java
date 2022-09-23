package com.weather.info.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weather.info.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
