package com.hem.springboot.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hem.springboot.demo.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
