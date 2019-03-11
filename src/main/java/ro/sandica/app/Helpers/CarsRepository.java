package ro.sandica.app.Helpers;

import org.springframework.data.repository.CrudRepository;

import ro.sandica.app.Entities.Car;

public interface CarsRepository extends CrudRepository<Car,Long>{

}
