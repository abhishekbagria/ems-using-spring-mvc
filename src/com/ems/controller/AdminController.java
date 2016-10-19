package com.ems.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ems.domain.User;
import com.ems.model.ui.filter.SearchFilter;
import com.ems.services.UserService;

@Controller
public class AdminController {

 @Autowired
 UserService userService;
 
// 
// @RequestMapping(value="/*", method = RequestMethod.GET)
// public String home(ModelMap model) {
//	 return "home";
// }
 
 @RequestMapping("/login")
 public ModelAndView loginUser() {
		  return new ModelAndView("login");	 
}
 
 @RequestMapping(value="/login", method=RequestMethod.POST)
 public ModelAndView loginUser( HttpServletRequest request, @ModelAttribute User user) {
	 ModelAndView model = null;
	 /*if (user.getUserName().equals(admin.getAdminName()) && user.getPassWord().equals(admin.getAdminPassWord())){
		         		 return new ModelAndView("adminHome");
	 }*/
	// else{
		 request.setAttribute("message", "Invalid Credentials!");
		model = new ModelAndView("login");
		model.addObject("user",user);
		return model;
//	 }
//	return "redirect:/errorPage";
		
 }
 
// @RequestMapping("/errorPage")
// public ModelAndView errorPage() {
//	  return new ModelAndView("errorPage");	 
// }
// 
 @RequestMapping("/adminHome")
 public ModelAndView adminHome(){
	 return new ModelAndView("adminHome");	
 }
 
 @RequestMapping("/createEmployee")
 public ModelAndView registerUser(@ModelAttribute User user) {
	 return new ModelAndView("createEmployee");	
}

 @RequestMapping("/insert")
 public String inserData(@ModelAttribute User user) {
  if (user != null)
   userService.insertData(user);
  return "redirect:/adminHome";

 }

 @RequestMapping("/listEmployee")
 public ModelAndView getUserLIst() {
		 List<User> userList = userService.getUserList();
		  return new ModelAndView("listEmployee", "userList", userList);
  
 }

 @RequestMapping(value="/updateEmployee",method=RequestMethod.POST)
 public ModelAndView editUser( @RequestParam String userName, @ModelAttribute User user) {
	 
		 user = userService.getUser(userName);
		  return new ModelAndView("updateEmployee", "userData", user);

 }

 @RequestMapping("/update")
 public String updateUser(@ModelAttribute User user) {
	 if (user != null){
		 userService.updateData(user);}
  return "redirect:/adminHome";
 }

 @RequestMapping("/delete")
 public String deleteUser(@RequestParam String userName) {
  System.out.println("userName = " + userName);
  userService.deleteData(userName);
  return "redirect:/adminHome";
 }

 @RequestMapping(value="/search", method=RequestMethod.GET)
 public ModelAndView searchUser(@ModelAttribute SearchFilter filter){
	  System.out.println("firstName = " + filter.getTerm());

	 List<User> userList = userService.searchData(filter.getCategory(), filter.getTerm());
	  return new ModelAndView("search", "userList", userList);
 }
 
 @RequestMapping("/checkUserName/{userName}")
 @ResponseBody
 public String checkUserName(@PathVariable String userName){
	 User user = userService.checkUserNameAvailability(userName);
	 if(user!=null) {
		 return "User already exists";
	 }
	 else {
		 return "User name is valid";
	 }
 }
 
@RequestMapping("/logout")
public ModelAndView logoutUser() {

	return new ModelAndView("login");	 
	}
}