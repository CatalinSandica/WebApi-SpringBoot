package ro.sandica.app.Helpers;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sandica.app.Entities.Car;



public class CarService implements CarServiceInterface{

	@Autowired
	private CarsRepository CR;
	
	@Override
	public Iterable<Car> findAllCars() {
		// TODO Auto-generated method stub
		return CR.findAll();
	}

	@Override
	public String createCar(Car car) {
		// TODO Auto-generated method stub
		return "OK";
	}

	@Override
	public String deleteCar(long id) {
		// TODO Auto-generated method stub
		return "OK";
	}

	@Override
	public String updateCar(Car car, String carid) {
		// TODO Auto-generated method stub
		return "OK";
	}

	@Override
	public Optional<Car> getCarbyID(long id) {
		// TODO Auto-generated method stub
		return CR.findById(id);
	}
	
	
}
