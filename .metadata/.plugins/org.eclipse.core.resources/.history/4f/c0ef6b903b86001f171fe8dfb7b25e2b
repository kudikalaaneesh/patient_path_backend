package capstone.project.paticentpath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import capstone.project.paticentpath.models.User;
import capstone.project.paticentpath.services.impl.Userserviceimpl;

@CrossOrigin(origins = "http://localhost:4200", 
methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE} , maxAge = 3600)
@RestController
@RequestMapping("user")

public class Authcontroller {

	@Autowired
	Userserviceimpl userservice;
	
	@PostMapping
	public ResponseEntity<User>  registerUser(@RequestBody User user){
		
		User reg = userservice.AddUser(user);
		
		return new  ResponseEntity<User>(reg,HttpStatus.ACCEPTED);
	}
	
	@GetMapping
	public List<User> getUser() {
		return userservice.getUserdata();
		}
	
	@GetMapping("login")
	public ResponseEntity<String> loginUser(@RequestBody User login){
		String res = userservice.login(login.getEmail(), login.getPassword());
		
		
		return new  ResponseEntity<String>(res,HttpStatus.ACCEPTED);
		
	}
		
	
	
}
