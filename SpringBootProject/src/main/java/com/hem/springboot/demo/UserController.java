package com.hem.springboot.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {
  @Autowired
  private UserRepository repo;
  
  @RequestMapping(value="/get",method = RequestMethod.GET)
  public List<User> findUsers() {
    return repo.findAll();
  }
  
  @RequestMapping(value="/add",method = RequestMethod.POST)
  public User addUser(@RequestBody User user) {
    return repo.saveAndFlush(user);
  }
  
  @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
  public User updateUser(@RequestBody User updatedUser, @PathVariable Integer id) {
	  updatedUser.setId(id);
    return repo.saveAndFlush(updatedUser);
  }
  
  @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
  public void deleteUser(@PathVariable Integer id) {
    repo.delete(id);
  }
}

