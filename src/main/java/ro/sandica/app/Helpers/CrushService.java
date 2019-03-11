package ro.sandica.app.Helpers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sandica.app.Entities.Crush;

@Service
public class CrushService implements CrushServiceInterface {

	@Autowired
	private CrushRepository CREP;

	@Override
	public Iterable<Crush> findAllCrushes() {
		// TODO Auto-generated method stub
		return CREP.findAll();
	}

	@Override
	public String createCrush(Crush crush) {
		// TODO Auto-generated method stub
		return "OK";
	}

	@Override
	public String deleteCrush(long id) {
		// TODO Auto-generated method stub
		return "OK";
	}

	@Override
	public String updateCrush(Crush crush, String crushid) {
		// TODO Auto-generated method stub
		return "OK";
	}

	@Override
	public Optional<Crush> getCrushbyID(long id) {
		// TODO Auto-generated method stub
		return CREP.findById(id);
	}
	
}
