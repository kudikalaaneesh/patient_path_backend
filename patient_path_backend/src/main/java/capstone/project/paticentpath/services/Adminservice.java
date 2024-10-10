package capstone.project.paticentpath.services;

import capstone.project.paticentpath.models.Adminuser;

public interface Adminservice {

	public Adminuser addAdmin(Adminuser auser);
	
	public boolean adminLogin(String email,String password);
}
