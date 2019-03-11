package ro.sandica.app.Helpers;

import org.springframework.data.repository.CrudRepository;
import ro.sandica.app.Entities.User;


public interface UsersRepository extends CrudRepository<User,Long>{

}
