package capstone.project.paticentpath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import capstone.project.paticentpath.models.BookAppointment;
import capstone.project.paticentpath.services.impl.BookAppointmentServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", 
methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE} , maxAge = 3600)
@RestController
@RequestMapping("/bookappointment")
public class BookAppointController {
		
	@Autowired
	BookAppointmentServiceImpl bookAppointImpl;
	
	
	@GetMapping
	public List<BookAppointment> getAllOrder(){
		return bookAppointImpl.getAllOrder();
	}
	
	@PostMapping
	public ResponseEntity<BookAppointment> addBook(@RequestBody BookAppointment book){
		BookAppointment book1 = bookAppointImpl.addAppointment(book);
		
		return new ResponseEntity<BookAppointment>(book1,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("{id}")
	public String deleteAppointment(@PathVariable int id) {
		boolean returnType=bookAppointImpl.deleteAppointment(id);
		if(returnType) {
			return " appointmnet deleted successfully";
		}
		return "Unable to delete the appointment";
	}
	
	@PutMapping("{id}")
	public String updateAppoint(@RequestBody BookAppointment book,@PathVariable int id) {
		boolean check=bookAppointImpl.updateAppointment(id, book);
		if(check) {
			return "update appointment succesuufully";
		}
		return "update appointment failure";
	}
	
	
	
}