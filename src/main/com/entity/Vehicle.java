package main.com.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vehicle")
public class Vehicle implements IVehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String brand;
	private Date year;
	private String power;
	@Column(name = "plates", unique = true)
	private String plates;
	private String type;

	public Vehicle() {}

	public Vehicle(String id, String brand, Date year, String power, String plates, String type) {
		this.id = id;
		this.brand = brand;
		this.year = year;
		this.power = power;
		this.plates = plates;
		this.type = type;
	}

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getPlates() {
		return plates;
	}

	public void setPlates(String plates) {
		this.plates = plates;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	@Override
	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
}
