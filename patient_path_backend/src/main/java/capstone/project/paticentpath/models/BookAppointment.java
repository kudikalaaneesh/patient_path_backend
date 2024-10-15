package capstone.project.paticentpath.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bookapointment")
public class BookAppointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String number;
	private String email;
	private String hospitalName;
	private String doctorName;
	private String specialist;
	private String date;
	private String time;
	
	public BookAppointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookAppointment(int id, String name, String number, String email, String hospitalName, String doctorName,
			String specialist, String date,String time) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
		this.hospitalName = hospitalName;
		this.doctorName = doctorName;
		this.specialist = specialist;
		this.date = date;
		this.time=time;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	

}