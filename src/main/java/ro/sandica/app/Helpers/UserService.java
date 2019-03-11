package ro.sandica.app.Helpers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sandica.app.Entities.User;

@Service
public class UserService implements UserServiceInterface{
	@Autowired
	private UsersRepository UR;
	
	public String createUser(User user) {
		//create user logic here
		return "OK";
	}
	
	public String deleteUser(long id) {
		//delete logic here
		return "OK";
	}
	public String updateUser(User user, String userid) {
		//update logic here
		return "OK";
	}
	
	public Optional<User> getUserbyID(long id) {
		return UR.findById(id);
	}
	
	@Override
	public Iterable<User> findAllUsers() {
		// TODO Auto-generated method stub
		return UR.findAll();
	}
}
