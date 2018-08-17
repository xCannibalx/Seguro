package lti.insurance.entity;

public class Vehicle {

	private String registration_no;
	private String vehicle_name;
	private String vehicle_type;
	private int model_year;
	private String vehicle_image;
	private int vehicle_price;
	private String email_id;

	public String getRegistration_no() {
		return registration_no;
	}

	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public int getModel_year() {
		return model_year;
	}

	public void setModel_year(int model_year) {
		this.model_year = model_year;
	}

	public String getVehicle_image() {
		return vehicle_image;
	}

	public void setVehicle_image(String vehicle_image) {
		this.vehicle_image = vehicle_image;
	}

	public int getVehicle_price() {
		return vehicle_price;
	}

	public void setVehicle_price(int vehicle_price) {
		this.vehicle_price = vehicle_price;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
