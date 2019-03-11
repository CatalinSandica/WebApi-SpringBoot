package ro.sandica.app.Helpers;

import java.util.Optional;

import ro.sandica.app.Entities.Crush;

public interface CrushServiceInterface {
	public Iterable<Crush> findAllCrushes();
	public String createCrush(Crush crush);
	public String deleteCrush(long id);
	public String updateCrush(Crush crush, String crushid);
	public Optional<Crush> getCrushbyID(long id);
}
