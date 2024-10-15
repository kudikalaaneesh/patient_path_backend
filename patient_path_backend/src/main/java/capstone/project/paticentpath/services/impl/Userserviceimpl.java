package capstone.project.paticentpath.services.impl;

import java.util.List;
import java.util.Optional;

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
	public boolean login(String email, String password) {
	 
		 User user = userrepo.findByEmail(email);

		    if (user == null) {
		      return false;
		    }

		    if (user.getPassword().equals(password)) {
		        return true;
		    } else {
		        return false;
		    }
	}

	@Override
	public User FechByEmail(String email) {
	
	User user = userrepo.findByEmail(email);
	System.out.println(user);
		return user;
		
	}
	
	

}
