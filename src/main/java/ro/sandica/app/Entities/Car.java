package ro.sandica.app.Entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "carID", unique = true, nullable = false)
	private long carId;
	
	@Column(name= "carType", unique = true, nullable = false)
	private String carType;
	
	@Column(name= "carManufacturer", unique = true, nullable = false)
	private String carManufacturer;
	
	@Column(name= "carModel")
	private String carModel;
	
	@Column(name= "carVersion")
	private String carVersion;
	
	@OneToMany
	@JoinColumn(name="users", nullable=false)
	private User user;
	
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarManufacturer() {
		return carManufacturer;
	}
	public void setCarManufacturer(String carManufacturer) {
		this.carManufacturer = carManufacturer;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarVersion() {
		return carVersion;
	}
	public void setCarVersion(String carVersion) {
		this.carVersion = carVersion;
	}
	
	public Car() {
		super();
	}
	public Car(long carId, String carType, String carManufacturer, String carModel, String carVersion, User user) {
		super();
		this.carId = carId;
		this.carType = carType;
		this.carManufacturer = carManufacturer;
		this.carModel = carModel;
		this.carVersion = carVersion;
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
