package ro.sandica.app.Helpers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import ro.sandica.app.Entities.User;

@Service
public class UserService implements UserServiceInterface{
	
	@Autowired
	private UsersRepository UR;
	
	
	@Override
	public Iterable<User> findAllUsers() {
		// TODO Auto-generated method stub
		return UR.findAll();
	}

	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		return "OK";
	}

	@Override
	public String deleteUser(long id) {
		// TODO Auto-generated method stub
		return "OK";
	}


	@Override
	public String updateUser(User user, String userid) {
		// TODO Auto-generated method stub
		return "OK";
	}


	@Override
	public Optional<User> getUserbyID(long id) {
		// TODO Auto-generated method stub
		return UR.findById(id);
	}
}
