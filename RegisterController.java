package ctrl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entity.Aadhar;
import repo.UserRepo;

public class RegisterController {
	@Autowired
	private UserRepo userrepo;
	
	@RequestMapping("/example5Controller")
	public String execute(@RequestParam("aadhar_no") String aadharNo, Map model) {
		Aadhar aadhar = userrepo.getuserinfo(aadhar_no);
		model.put("aadhar", aadhar);
		return "registeroutput";
	}

}
