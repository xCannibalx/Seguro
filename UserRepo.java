package repo;

import bean.ForgetBean;
import bean.LoginBean;
import entity.Flight;
import entity.User;

public interface UserRepo {

User authenticate(LoginBean login);
	
	boolean validate(ForgetBean forget);
	
	boolean changePassword(LoginBean change);
	
	boolean persist(User user);
	
	public Aadhar getuserinfo(String aadhar_no);
}
