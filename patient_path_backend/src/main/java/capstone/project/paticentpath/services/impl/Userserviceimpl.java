package capstone.project.paticentpath.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import capstone.project.paticentpath.models.User;
import capstone.project.paticentpath.repositorys.UserReg;
import capstone.project.paticentpath.services.UserService;


@Service
public class Userserviceimpl implements UserService {

	@Autowired
	UserReg userrepo;
	
	
	@Override
	public User AddUser(User user) {
		
		return userrepo.save(user);
	}

	public List<User> getUserdata() {
	
		return  userrepo.findAll();
	}

	@Override
	public String login(String email, String password) {
	 
		User user = userrepo.findByEmail(email);
		String res="";
		 if(user==null) {
				res =  "Email Not found";
				return "Email not found";
				}
		 if(user!=null  && user.getPassword().equals(password)) {
			res =  "Login Sucess";
		}
		
		  if(!password.equals(user.getPassword())) {
				res =  "Wrong password try again";
			}
		
  return res;
	}
	
	

}
