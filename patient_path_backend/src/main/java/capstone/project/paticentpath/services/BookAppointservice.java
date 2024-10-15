package capstone.project.paticentpath.services;

import java.util.List;

import capstone.project.paticentpath.models.BookAppointment;

public interface BookAppointservice {
	
	public BookAppointment addAppointment(BookAppointment bookappoint);
	
	public boolean deleteAppointment(int id);
	
	public boolean updateAppointment(int id,BookAppointment bookappoint);
	
	public List<BookAppointment> getAllOrder();
}