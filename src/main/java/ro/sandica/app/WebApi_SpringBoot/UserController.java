package ro.sandica.app.WebApi_SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ro.sandica.app.Entities.User;
import ro.sandica.app.Helpers.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService US; 
    
    @RequestMapping("/")
    @ResponseBody
    public Iterable<User> getAllUsers(){
    	return US.findAllUsers();
    }
    
}
