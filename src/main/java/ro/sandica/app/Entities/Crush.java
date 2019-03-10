package ro.sandica.app.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "crushes")
public class Crush {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "crushId", unique = true, nullable = false)	 
	private long crushId;
	
	@Column(name= "crushLocation", nullable = false)
	private String crushLocation;
	
	@Column(name= "crushExplanation", nullable = false)
	private String crushExplanation;
	
	@OneToOne
	@JoinColumn(name="cars", nullable=false)
	@Column(name= "crushcar")
	private Car car;

	
	public long getCrushId() {
		return crushId;
	}

	public void setCrushId(long crushId) {
		this.crushId = crushId;
	}

	public String getCrushLocation() {
		return crushLocation;
	}

	public void setCrushLocation(String crushLocation) {
		this.crushLocation = crushLocation;
	}

	public String getCrushExplanation() {
		return crushExplanation;
	}

	public void setCrushExplanation(String crushExplanation) {
		this.crushExplanation = crushExplanation;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Crush() {
		super();
	}

	public Crush(long crushId, String crushLocation, String crushExplanation, Car car) {
		super();
		this.crushId = crushId;
		this.crushLocation = crushLocation;
		this.crushExplanation = crushExplanation;
		this.car = car;
	}
	
}
