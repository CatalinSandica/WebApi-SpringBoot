package ro.sandica.app.Helpers;

import java.util.ArrayList;

import ro.sandica.app.Entities.Car;



public class CarService {
	
	public String createCar(Car car) {
		//create Car logic here
		return "OK";
	}
	public ArrayList<Car> getAll(){
		ArrayList<Car> list = new ArrayList<Car>();
		//get all Cars logic here
		return list;
	}
	public String deleteCar(long id) {
		//delete logic here
		return "OK";
	}
	public String updateCar(String carid) {
		//update logic here
		return "OK";
	}
	public Car getCarbyID(long id) {
		Car car = new Car();
		//get Car by id logic here
		return car;
	}
}
