package capstone.project.paticentpath.services;

import java.util.List;

import capstone.project.paticentpath.models.User;

public interface UserService {

	public User AddUser(User user);
	
	public List<User> getUserdata();
	
	public boolean login(String email,String password);
}
