package ro.sandica.app.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {
	
	private static final long serialVersionUID = 7883019972509122155L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "userID", unique = true, nullable = false)
	private long userId;
	
	@Column(name= "username", unique = true, nullable = false)
	private String userName;
	
	@Column(name= "userpass", unique = true, nullable = false)
	private String userPass;
	
	@Column(name= "firstname")
	private String firstName;
	
	@Column(name= "lastname")
	private String lastName;
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public User() {
		super();
	}
	public User(long userId, String userName, String userPass, String firstName, String lastName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPass = userPass;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
