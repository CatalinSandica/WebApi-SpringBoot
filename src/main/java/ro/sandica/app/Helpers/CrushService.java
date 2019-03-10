package ro.sandica.app.Helpers;

import java.util.ArrayList;

import ro.sandica.app.Entities.Crush;

public class CrushService {

	public String createCrush(Crush crush) {
		//create Crush logic here
		return "OK";
	}
	public ArrayList<Crush> getAll(){
		ArrayList<Crush> list = new ArrayList<Crush>();
		//get all crushses logic here
		return list;
	}
	public String deleteCrush(long id) {
		//delete logic here
		return "OK";
	}
	public String updateCrush(String Crushid) {
		//update logic here
		return "OK";
	}
	public Crush getCrushbyID(long id) {
		Crush crush = new Crush();
		//get crush by id logic here
		return crush;
	}
}
