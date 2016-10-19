package com.ems.services;

import java.util.List;

import com.ems.domain.User;

public interface UserService {

 public void insertData(User user);
 public List<User> getUserList();
 public void deleteData(String userName);
 public User getUser(String userName);
 public void updateData(User user);
 public List<User> searchData(String category, String firstName);
public User checkUserNameAvailability(String userName);

}