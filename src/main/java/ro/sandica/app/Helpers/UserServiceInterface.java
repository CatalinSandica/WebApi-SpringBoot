package ro.sandica.app.Helpers;

import java.util.Optional;

import ro.sandica.app.Entities.User;

public interface UserServiceInterface {
	public Iterable<User> findAllUsers();
	public String createUser(User user);
	public String deleteUser(long id);
	public String updateUser(User user, String userid);
	public Optional<User> getUserbyID(long id);
}
