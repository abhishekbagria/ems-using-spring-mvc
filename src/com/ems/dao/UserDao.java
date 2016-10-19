package com.ems.dao;


import java.util.List;

import com.ems.domain.User;

public interface UserDao {
 public void insertData(User user);
 public List<User> getUserList();
 public void updateData(User user);
 public void deleteData(String userName);
 public User getUser(String userName);
public List<User> searchData(String category, String firstName);
public User checkUserNameAvailability(String userName);
}
