package com.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ems.dao.UserDao;
import com.ems.domain.User;


public class UserServiceImpl implements UserService {

 @Autowired
 UserDao userdao;

 @Override
 public void insertData(User user) {
  userdao.insertData(user);
 }

 @Override
 public List<User> getUserList() {
  return userdao.getUserList();
 }

 @Override
 public void deleteData(String userName) {
  userdao.deleteData(userName);
  
 }

 @Override
 public User getUser(String userName) {
  return userdao.getUser(userName);
 }

 @Override
 public void updateData(User user) {
  userdao.updateData(user);
  
 }

 @Override
 public List<User> searchData(String category, String term) {
 return userdao.searchData(category, term);
  
 }

 @Override
 public User checkUserNameAvailability(String userName) {
 return userdao.checkUserNameAvailability(userName);
  
 }
}