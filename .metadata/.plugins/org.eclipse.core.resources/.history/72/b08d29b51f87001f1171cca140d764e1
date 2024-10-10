package capstone.project.paticentpath.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import capstone.project.paticentpath.exceptions.ResourceNotFound;
import capstone.project.paticentpath.models.Doctor;
import capstone.project.paticentpath.repositorys.DoctoRepo;
import capstone.project.paticentpath.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctoRepo drepo;
	
	
	
	@Override
	public Doctor addDoctor(Doctor doctor) {
		
		return  drepo.save(doctor) ;
	}

	@Override
	public List<Doctor> getAllDoctors() {
	
		return drepo.findAll();
	}

	@Override
	public boolean deleteDoctor(int id) {
	 // boolean idDelted = false;
	  Optional<Doctor> doc = drepo.findById(id);
	  if(doc.isPresent()) {
		  drepo.deleteById(id);
		  return true;
	  }
		return false;
	}

	@Override
	public Doctor updateDocterDetails(Doctor updateDoctor ,int id) {
		 Optional<Doctor> doc = drepo.findById(id);
		 if(doc.isPresent()) {
			 
		 }
		return null;
	}
	
	

}
