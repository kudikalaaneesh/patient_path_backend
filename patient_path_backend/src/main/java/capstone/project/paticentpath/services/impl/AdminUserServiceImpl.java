package capstone.project.paticentpath.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import capstone.project.paticentpath.models.Adminuser;
import capstone.project.paticentpath.repositorys.Adminuserpp;
import capstone.project.paticentpath.services.Adminservice;

@Service
public class AdminUserServiceImpl implements Adminservice {

	@Autowired
	Adminuserpp adminrepo;
	
	
	@Override
	public Adminuser addAdmin(Adminuser auser) {
		
		return adminrepo.save(auser);
	}

	@Override
	public boolean adminLogin(String email, String password) {
		Adminuser admin = adminrepo.findByEmail(email);
		if(admin!=null && admin.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

}
