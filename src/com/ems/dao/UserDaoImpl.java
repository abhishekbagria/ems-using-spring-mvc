package com.ems.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

import com.ems.domain.User;
import com.ems.jdbc.UserRowMapper;

public class UserDaoImpl implements UserDao {

 @Autowired
 DataSource dataSource;

 public void insertData(User user) {

  String sql = "INSERT INTO user "
    + "(user_name,pass_word,first_name,last_name,date_of_birth,gender,address,city,state,"
    + "country,pin_code,phone_num,email_address) VALUES (?,md5(?),?,?,?,?,?,?,?,?,?,?,?)";

  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

  jdbcTemplate.update(
    sql,
    new Object[] {user.getUserName(), user.getPassWord(), user.getFirstName(), user.getLastName(),user.getDateOfBirth(),
      user.getGender(),user.getAddress(), user.getCity(), user.getState(), user.getCountry(), user.getPIN(),user.getPhone(), 
      user.getEmailId()});

 }

 public List<User> getUserList() {
  List<User> userList = new ArrayList<User>();

  String sql = "select * from user";

  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
  userList = jdbcTemplate.query(sql, new UserRowMapper());
  return userList;
 }
 
 public List<User> searchData(String category, String term) {
	  List<User> userList = new ArrayList<User>();

	  String sql = "select * from user where "+category+" like '%"+term+"%'";

	  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	  userList = jdbcTemplate.query(sql, new UserRowMapper());
	  return userList;
	 }

 @Override
 public void deleteData(String userName) {
  String sql = "delete from user where user_name='" +userName+"'";
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
  jdbcTemplate.update(sql);

 }

 @Override
 public void updateData(User user) {

  String sql = "UPDATE user SET first_name = ?, last_name = ?, date_of_birth = ?, gender = ?, address = ?,"
  		+ " city = ?, state=?, country = ?, pin_code = ?, phone_num = ?, email_address = ? WHERE user_name = ?";
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
System.out.println(user.getAddress());
System.out.println(user.getCity());
  /*jdbcTemplate.update(
    sql, user.getFirstName(), user.getLastName(),user.getDateOfBirth(), user.getGender(),
    user.getAddress(), user.getCity(), user.getState(), user.getCountry(), user.getPIN(),user.getPhone(), 
    user.getEmailId(), user.getUserName());*/
 jdbcTemplate.update(new PreparedStatementCreator() {
	
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, user.getFirstName());
		ps.setString(2, user.getLastName());
		ps.setString(3, user.getDateOfBirth());
		ps.setString(4, user.getGender());
		ps.setString(5, user.getAddress());
		ps.setString(6, user.getCity());
		ps.setString(7, user.getState());
		ps.setString(8, user.getCountry());
		ps.setString(9, user.getPIN());
		ps.setString(10, user.getPhone());
		ps.setString(11, user.getEmailId());
		ps.setString(12, user.getUserName());
		return ps;
	}
});

 }

 @Override
 public User getUser(String userName) {
  List<User> userList = new ArrayList<User>();
  String sql = "select * from user where user_name='"+userName+"'";
  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
  userList = jdbcTemplate.query(sql, new UserRowMapper());
  return userList.get(0);
 }

@Override
public User checkUserNameAvailability(String userName) {
	List<User> userList = new ArrayList<User>();
	  String sql = "select * from user where user_name='"+userName+"'";
	  JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	  userList = jdbcTemplate.query(sql, new UserRowMapper());
	  return userList.get(0);
}
}