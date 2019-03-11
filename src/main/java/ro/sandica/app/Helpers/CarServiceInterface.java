package ro.sandica.app.Helpers;

import java.util.Optional;

import ro.sandica.app.Entities.Car;

public interface CarServiceInterface {
	
	public Iterable<Car> findAllCars();
	public String createCar(Car car);
	public String deleteCar(long id);
	public String updateCar(Car car, String carid);
	public Optional<Car> getCarbyID(long id);
}
