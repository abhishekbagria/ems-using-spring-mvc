package com.ems.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.ems.domain.User;

public class UserExtractor implements ResultSetExtractor<User> {

 public User extractData(ResultSet resultSet) throws SQLException,
   DataAccessException {
  
  User user = new User();
  user.setUserName(resultSet.getString(1));
  user.setPassWord(resultSet.getString(2));
  user.setFirstName(resultSet.getString(3));
  user.setLastName(resultSet.getString(4));
  user.setDateOfBirth(resultSet.getString(5));
  user.setGender(resultSet.getString(6));
  user.setAddress(resultSet.getString(7));
  user.setCity(resultSet.getString(8));
  user.setState(resultSet.getString(9));
  user.setCountry(resultSet.getString(10));
  user.setPIN(resultSet.getString(11));
  user.setPhone(resultSet.getString(12));
  user.setEmailId(resultSet.getString(13));
  
  return user;
 }

}