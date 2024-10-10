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
		//Object doc1= drepo.findById(id);
		System.out.println("THis is working");
		Doctor existingDoctor = drepo.findById(id).orElseThrow(() -> new ResourceNotFound("Doctor", "id", id));
        System.out.println("doctor works");
        if(existingDoctor.getId()==id) {
	    existingDoctor.setDoctorName(updateDoctor.getDoctorName());
	    existingDoctor.setDoctorSpilist(updateDoctor.getDoctorSpilist());
	    existingDoctor.setExprence(updateDoctor.getExprence());
	    existingDoctor.setEducation(updateDoctor.getEducation());
       drepo.save(existingDoctor);
        }
	    return existingDoctor;
	}

	@Override
	public boolean doctor_avilable(int id) {
		///Object doc1= drepo.findById(id).orElse(()-> );
		Doctor oldoc = drepo.findById(id).orElseThrow(()-> new ResourceNotFound("Doctor", "id", id));
		if(oldoc.getDoctor_avilable()) {
		oldoc.setDoctor_avilable(false);
		}else {
			oldoc.setDoctor_avilable(true);
		}
		drepo.save(oldoc);
		return false;
	}
	
	

}
