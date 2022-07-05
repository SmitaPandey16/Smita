package com.test.SpringCRUDH2memory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.SpringCRUDH2memory.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
