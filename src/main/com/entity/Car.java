package main.com.entity;

public class Car implements Vehicle {

	private String brand;
	private String year;
	private String power;

	public Car() {}

	public Car(String brand, String year, String power) {
		this.brand = brand;
		this.year = year;
		this.power = power;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}
}
