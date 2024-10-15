package capstone.project.paticentpath.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import capstone.project.paticentpath.models.BookAppointment;
import capstone.project.paticentpath.repositorys.BookAppoint;
import capstone.project.paticentpath.services.BookAppointservice;
@Service
public class BookAppointmentServiceImpl implements  BookAppointservice{
	
	@Autowired
	BookAppoint appoint;
	@Autowired
	SendEmailImpl sendemail;
  
	@Override
	public BookAppointment addAppointment(BookAppointment bookappoint) {
		
		return appoint.save(bookappoint);
	}

	@Override
	public boolean deleteAppointment(int id) {
		Optional<BookAppointment> order=appoint.findById(id);
		if(order.isPresent()) {
			
			Optional<BookAppointment> delap = appoint.findById(id);
			 appoint.deleteById(id);
			if(delap.isPresent()) {
				sendemail.sendEmail(delap.get().getEmail() ,"Your appoinment is canclled ", this.displayData(delap.get()));
			}
				
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAppointment(int id, BookAppointment bookappoint) {
		Optional<BookAppointment> order=appoint.findById(id);
		BookAppointment updateAppoint=null;
		if(order.isPresent()) {
			updateAppoint =(BookAppointment) order.get();
			if(updateAppoint.getId()==id) {
				updateAppoint.setName(bookappoint.getName());
				updateAppoint.setNumber(bookappoint.getNumber());
				updateAppoint.setEmail(bookappoint.getEmail());
				updateAppoint.setDate(bookappoint.getDate());
				updateAppoint.setDoctorName(bookappoint.getDoctorName());
				updateAppoint.setHospitalName(bookappoint.getHospitalName());
				updateAppoint.setSpecialist(bookappoint.getSpecialist());
				updateAppoint.setTime(bookappoint.getTime());
				appoint.save(updateAppoint);
				return true;
				
			}
			
		}
		return false;
	}

	@Override
	public List<BookAppointment> getAllOrder() {
		
		return appoint.findAll();
	}
	public String  displayData(BookAppointment ap) {
		return "Hi "+ap.getName()+"\n Your appoinment details\n\n"+"Hospital Name "+ap.getHospitalName()+"\n Doctor Name : "+ap.getDoctorName()+"\n"+
	" Appoinment Date : "+ap.getDate()+"\n Appoinment Time : "+ap.getTime()+"\n"
			+ "Thankyou for booking your appoinment by Patient path";
	}

	
}