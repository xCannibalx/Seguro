package lti.insurance.entity;

import java.util.Date;

public class Policy {

	private int policy_no;
	private String registration_no;
	private String policy_value;
	private Date start_date;
	private Date last_date;
	private int premium_value;
	private String policy_type;
	private String email_id;
	public int getPolicy_no() {
		return policy_no;
	}
	public void setPolicy_no(int policy_no) {
		this.policy_no = policy_no;
	}
	public String getRegistration_no() {
		return registration_no;
	}
	public void setRegistration_no(String registration_no) {
		this.registration_no = registration_no;
	}
	public String getPolicy_value() {
		return policy_value;
	}
	public void setPolicy_value(String policy_value) {
		this.policy_value = policy_value;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getLast_date() {
		return last_date;
	}
	public void setLast_date(Date last_date) {
		this.last_date = last_date;
	}
	public int getPremium_value() {
		return premium_value;
	}
	public void setPremium_value(int premium_value) {
		this.premium_value = premium_value;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	
}
