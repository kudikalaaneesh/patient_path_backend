package capstone.project.paticentpath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import capstone.project.paticentpath.models.Doctor;
import capstone.project.paticentpath.services.impl.DoctorServiceImpl;
import capstone.project.paticentpath.services.impl.SendEmailImpl;


@CrossOrigin(origins = "http://localhost:4200", 
methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE} , maxAge = 3600)
@RestController
@RequestMapping("doctor")
public class DoctorController {
@Autowired
DoctorServiceImpl doctorservice;

@Autowired
SendEmailImpl  sendmail;

@PostMapping
public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor) {
	
	Doctor doc = doctorservice.addDoctor(doctor);
	String data = doc.toString()+" you registation is sucess";
	sendmail.sendEmail("2000031519cse@gmail.com", "Regestation is sucess",data);
	return new ResponseEntity<Doctor>(doc,HttpStatus.ACCEPTED);
}

@GetMapping
public List<Doctor> getAllDoctors(){
	return doctorservice.getAllDoctors();
}


@DeleteMapping("{id}")
public boolean deleteDoctorByID(@PathVariable int id) {
	boolean res=false;
	res = doctorservice.deleteDoctor(id);
	if(res) {
		return true;
	}
	
	return false;
}

@PutMapping("update/{id}")
public Doctor updateDoctorDetails(@RequestBody Doctor doc,@PathVariable int id){
	
	Doctor updatedDoc = doctorservice.updateDocterDetails(doc, id);
	
	return updatedDoc;
	
}

@PutMapping("doctor-aviable/{id}")
public boolean doctorAvible(@PathVariable int id) {
	return doctorservice.doctor_avilable(id);
}




}
