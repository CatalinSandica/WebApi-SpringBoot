package ro.sandica.app.Helpers;

import java.util.ArrayList;

import ro.sandica.app.Entities.User;

public class UserService {
	
	public String createUser(User user) {
		//create user logic here
		return "OK";
	}
	public ArrayList<User> getAll(){
		ArrayList<User> list = new ArrayList<User>();
		//get all users logic here
		return list;
	}
	public String deleteUser(long id) {
		//delete logic here
		return "OK";
	}
	public String updateUser(String userid) {
		//update logic here
		return "OK";
	}
	public User getUserbyID(long id) {
		User user = new User();
		//get user by id logic here
		return user;
	}
}
